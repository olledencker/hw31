package com.mycompany.hw31;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        final MongoClient mongoClient;
        try {
            mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));

            final DB studentsDB = mongoClient.getDB("school");
            DBCollection students = studentsDB.getCollection("students");
            DBObject student = new BasicDBObject("","");
            
        } catch (Exception e) {
            System.out.println("Fel");
            e.printStackTrace();;

        }
    }
}
