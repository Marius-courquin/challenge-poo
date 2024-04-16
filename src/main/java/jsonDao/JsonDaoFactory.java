package jsonDao;

import dao.Dao;
import dao.DaoFactory;
import domain.Symptom;

public class JsonDaoFactory extends DaoFactory {
    public JsonDaoMealSingleton getDaoMeal() {
        return JsonDaoMealSingleton.getInstance();
    }

    public JsonDaoSymptomSingleton getDaoSymptom() {
        return JsonDaoSymptomSingleton.getInstance();
    }
}
