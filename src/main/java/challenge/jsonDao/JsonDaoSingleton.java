package challenge.jsonDao;

import challenge.Mapper.Mapper;
import challenge.dao.Dao;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.UuidRepresentation;
import org.mongojack.JacksonMongoCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class JsonDaoSingleton<T, S> implements Dao<T> {
    private static MongoClient client;
    protected JacksonMongoCollection<S> collection;
    private Mapper<T, S> mapper;

    private static final String DATABASE_HOST = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "challenge-poo";

    static {
        client = MongoClients.create(DATABASE_HOST);
    }

    protected JsonDaoSingleton(Class<S> entityClass, Mapper<T, S> mapperToUse) {
        MongoDatabase database = client.getDatabase(DATABASE_NAME);
        collection = JacksonMongoCollection.builder()
                .build(database, DATABASE_NAME, entityClass, UuidRepresentation.STANDARD);
        mapper = mapperToUse;
    }

    public boolean create(T obj) {
        try {
            S objectToCreate = mapper.fromDomain(obj);
            collection.insertOne(objectToCreate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public T find(Class c, String id) {
        return mapper.toDomain(collection.findOneById(id));
    }

    public List<T> findAll(Class c) {
        var list = collection.find().into(new ArrayList<>());
        return list.stream().map(mapper::toDomain).collect(Collectors.toList());
    }

    public boolean update(T obj) {
        try {
            var objectToUpdate = mapper.fromDomain(obj);
            collection.replaceOne(Filters.eq("_id", objectToUpdate), objectToUpdate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(T obj) {
        try {
            var objectToDelete = mapper.fromDomain(obj);
            collection.deleteOne(Filters.eq("_id", objectToDelete));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteAll(Class c) {
        try {
            collection.deleteMany(new org.bson.Document());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void close() {
        if (client != null) {
            client.close();
            client = null;
        }
    }

}
