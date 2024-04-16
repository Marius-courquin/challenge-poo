package challenge.jsonDao;

import challenge.dao.DaoFactory;

public class JsonDaoFactory extends DaoFactory {
    public JsonDaoMealSingleton getDaoMeal() {
        return JsonDaoMealSingleton.getInstance();
    }

    public JsonDaoSymptomSingleton getDaoSymptom() {
        return JsonDaoSymptomSingleton.getInstance();
    }
}
