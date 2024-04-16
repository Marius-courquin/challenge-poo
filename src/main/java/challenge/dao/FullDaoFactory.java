package challenge.dao;

public abstract class FullDaoFactory extends DaoFactory {
    public abstract DaoAdresse getDaoAdresse();

    public abstract DaoTypeBien getDaoTypeBien();

    public abstract DaoCategorieSurface getDaoCategorieSurface();

}
