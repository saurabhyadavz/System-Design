package org.example.factoryPattern.connection.impl;

import org.example.factoryPattern.connection.DatabaseConnection;

public class MongoDBConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MongoDB database");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing MongoDB query (converted to NoSQL): " + sql);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MongoDB database");
    }
}
