package dao;

import domain.Meal;
import domain.Symptom;
import jsonDao.JsonDaoFactory;

public abstract class DaoFactory {
    public abstract Dao<Meal> getDaoMeal();

    public abstract Dao<Symptom> getDaoSymptom();

    public static DaoFactory getDaoFactory(PersistenceType type) {
        switch (type) {
            case JPA:
                return null;
            case JSON:
                return new JsonDaoFactory();
            default:
                return null;
        }
    }

}
