package org.example.factorypattern.connection.impl;

import org.example.factorypattern.connection.DatabaseConnection;

public class MySQLConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to mysql db");
    }

    @Override
    public void query(String query) {
        System.out.println("Querying to mysql db: "+query);
    }

    @Override
    public void disconnect() {
        System.out.println("Querying to mysql db");
    }
}
