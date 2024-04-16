package jsonDao;

import metier.Bien;
import metier.E_Bien;

public class JsonDaoBienSingleton extends JsonDaoSingleton<Bien> implements DaoBien {
            private JsonDaoBienSingleton() {
                super(Bien.class);
            }

            private static JsonDaoBienSingleton instance;

            public static JsonDaoBienSingleton getInstance() {
                if (instance == null) {
                    instance = new JsonDaoBienSingleton();
                }
                return instance;
            }
}
