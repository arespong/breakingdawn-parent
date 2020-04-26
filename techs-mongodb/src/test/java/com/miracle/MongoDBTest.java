package com.miracle;

import com.mongodb.MongoClient;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

public class MongoDBTest {
    @Test
    public void testMongDBConnectiong(){
        MongoClient client = new MongoClient("localhost",27017);
        MongoDatabase clientDatabase = client.getDatabase("test02");
        MongoCollection<Document> students = clientDatabase.getCollection("student");
        long count = students.count();
        System.out.println(count);

    }
}
