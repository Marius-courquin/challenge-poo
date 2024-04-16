package jpaDaoSingleton;

import dao.Dao;
import dao.IntDao;
import jakarta.persistence.*;

import java.util.List;

public abstract class JpaDaoSingleton<T> implements IntDao<T> {

    private EntityManagerFactory factory;
    protected EntityManager entityManager;

    private static final String PERSISTENCE_UNIT_NAME = "default";

    protected JpaDaoSingleton() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        entityManager = factory.createEntityManager();
    }

    public boolean create(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        try {
            entityManager.persist(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public T find(Class c, int id) {
        return (T) entityManager.find(c, id);
    }

    public List<T> findAll(Class c) {
        TypedQuery<T> query = entityManager.createQuery("SELECT t FROM " + c.getSimpleName() + " t", c);
        return query.getResultList();
    }

    public boolean update(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        try {
            entityManager.merge(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public boolean delete(T obj) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        try {
            entityManager.remove(obj);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public boolean deleteAll(Class c) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        try {
            TypedQuery<T> query = entityManager.createQuery("DELETE FROM " + c.getSimpleName(), c);
            query.executeUpdate();
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public void close() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
