package jsonDao;

import Mapper.MealDocumentMapper;
import document.MealDocument;
import domain.Meal;

public class JsonDaoMealSingleton extends JsonDaoSingleton<Meal, MealDocument> implements DaoMeal {
            private JsonDaoMealSingleton() {
                super(MealDocument.class, new MealDocumentMapper());
            }

            private static JsonDaoMealSingleton instance;

            public static JsonDaoMealSingleton getInstance() {
                if (instance == null) {
                    instance = new JsonDaoMealSingleton();
                }
                return instance;
            }
}
