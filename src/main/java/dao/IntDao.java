package dao;

public interface IntDao<T> extends Dao<T> {
    public T find(Class c, int id);
}
