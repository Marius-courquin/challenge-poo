package challenge.dao;

import challenge.jsonDao.JsonDaoFactory;
import challenge.jpaDaoSingleton.JpaDaoFactory;

public abstract class DaoFactory {
    public abstract Dao getDaoBien();

    public static DaoFactory getDaoFactory(PersistenceType type) {
        switch (type) {
            case JPA:
                return new JpaDaoFactory();
            case JSON:
                return new JsonDaoFactory();
            default:
                return null;
        }
    }

}
