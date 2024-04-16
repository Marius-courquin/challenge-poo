package jsonDao;

import Mapper.SymptomDocumentMapper;
import dao.DaoSymptom;
import document.SymptomDocument;
import domain.Meal;
import domain.Symptom;

public class JsonDaoSymptomSingleton extends JsonDaoSingleton<Symptom, SymptomDocument> implements DaoSymptom {
            private JsonDaoSymptomSingleton() {
                super(SymptomDocument.class, new SymptomDocumentMapper());
            }

            private static JsonDaoSymptomSingleton instance;

            public static JsonDaoSymptomSingleton getInstance() {
                if (instance == null) {
                    instance = new JsonDaoSymptomSingleton();
                }
                return instance;
            }
}
