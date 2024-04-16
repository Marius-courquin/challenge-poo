package challenge.dao;

public interface StringDao<T> extends Dao<T> {
    public T find(Class c, String id);
}
