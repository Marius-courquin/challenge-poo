package jpaDaoSingleton;

import dao.DaoTypeBien;
import metier.E_TypeBien;

public class JpaDaoTypeBienSingleton extends JpaDaoSingleton<E_TypeBien> implements DaoTypeBien {

    private JpaDaoTypeBienSingleton() {
        super();
    }

    private static JpaDaoTypeBienSingleton instance;

    public static JpaDaoTypeBienSingleton getInstance() {
        if (instance == null) {
            instance = new JpaDaoTypeBienSingleton();
        }
        return instance;
    }

    public E_TypeBien find(int id) {
        return entityManager.find(E_TypeBien.class, id);
    }

    public E_TypeBien findLibTypeBien(String libelle) {
        return entityManager.createQuery("SELECT t FROM E_TypeBien t WHERE t.libTypeBien = :libelle", E_TypeBien.class)
                .setParameter("libelle", libelle)
                .getSingleResult();
    }
}
