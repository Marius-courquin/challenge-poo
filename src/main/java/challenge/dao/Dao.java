package challenge.dao;

import java.util.List;

public interface Dao<T>{
    public boolean create(T obj) ;
    public T find(Class c, String id);
    public List<T> findAll(Class c);
    public boolean update(T obj) ;
    public boolean delete(T obj) ;
    public boolean deleteAll(Class c) ;
    public void close();
}
