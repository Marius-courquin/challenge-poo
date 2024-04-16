package jpaDaoSingleton;

import dao.DaoBien;
import metier.E_Bien;

public class JpaDaoBienSingleton extends JpaDaoSingleton<E_Bien> implements DaoBien {

        private JpaDaoBienSingleton() {
            super();
        }

        private static JpaDaoBienSingleton instance;

        public static JpaDaoBienSingleton getInstance() {
            if (instance == null) {
                instance = new JpaDaoBienSingleton();
            }
            return instance;
        }

}
