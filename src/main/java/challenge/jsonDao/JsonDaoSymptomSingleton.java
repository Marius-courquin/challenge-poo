package challenge.jsonDao;

import challenge.Mapper.SymptomDocumentMapper;
import challenge.dao.DaoSymptom;
import challenge.document.SymptomDocument;
import challenge.domain.Symptom;

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
