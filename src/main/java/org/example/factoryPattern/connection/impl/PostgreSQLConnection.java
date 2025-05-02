package org.example.factoryPattern.connection.impl;

import org.example.factoryPattern.connection.DatabaseConnection;

public class PostgreSQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing PostgreSQL query: " + sql);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL database");
    }
}
