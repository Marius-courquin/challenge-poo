package challenge.jpaDaoSingleton;

import challenge.dao.FullDaoFactory;

public class JpaDaoFactory extends FullDaoFactory {
    public JpaDaoAdresseSingleton getDaoAdresse() {
        return JpaDaoAdresseSingleton.getInstance();
    }

    public JpaDaoTypeBienSingleton getDaoTypeBien() {
        return JpaDaoTypeBienSingleton.getInstance();
    }

    public JpaDaoCategorieSurfaceSingleton getDaoCategorieSurface() {
        return JpaDaoCategorieSurfaceSingleton.getInstance();
    }

    public JpaDaoBienSingleton getDaoBien() {
        return JpaDaoBienSingleton.getInstance();
    }
}
