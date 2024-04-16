package Mapper;

public interface Mapper<T, S> {
    public S fromDomain(T obj);
    public T toDomain(S obj);
}
