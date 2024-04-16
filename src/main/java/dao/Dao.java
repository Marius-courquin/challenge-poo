package dao;

import java.util.List;

public interface Dao<T>{
    public boolean create(T obj) ;
    public List<T> findAll(Class c);
    public boolean update(T obj) ;
    public boolean delete(T obj) ;
    public boolean deleteAll(Class c) ;
    public void close();
}
