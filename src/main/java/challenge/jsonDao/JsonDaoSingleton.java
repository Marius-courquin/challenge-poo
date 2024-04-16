package challenge.jsonDao;

import challenge.dao.StringDao;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.UuidRepresentation;
import org.mongojack.JacksonMongoCollection;

import java.util.ArrayList;
import java.util.List;

public abstract class JsonDaoSingleton<T> implements StringDao<T> {
    private static MongoClient client;
    protected JacksonMongoCollection<T> collection;

    private static final String DATABASE_HOST = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "design_pattern";

    static {
        client = MongoClients.create(DATABASE_HOST);
    }

    protected JsonDaoSingleton(Class<T> entityClass) {
        MongoDatabase database = client.getDatabase(DATABASE_NAME);
        collection = JacksonMongoCollection.builder()
                .build(database, DATABASE_NAME, entityClass, UuidRepresentation.STANDARD);
    }

    public boolean create(T obj) {
        try {
            collection.insertOne(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public T find(Class c, String id) {
        return collection.findOneById(id);
    }

    public List<T> findAll(Class c) {
        return collection.find().into(new ArrayList<>());
    }

    public boolean update(T obj) {
        try {
            collection.replaceOne(Filters.eq("_id", obj), obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(T obj) {
        try {
            collection.deleteOne(Filters.eq("_id", obj));
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
