package challenge.jpaDaoSingleton;

import challenge.dao.DaoBien;
import challenge.metier.E_Bien;

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
