package dao;

import jpaDaoSingleton.JpaDaoFactory;
import jsonDao.JsonDaoFactory;

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
