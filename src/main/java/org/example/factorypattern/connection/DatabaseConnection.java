package org.example.factorypattern.connection;

public interface DatabaseConnection {
    void connect();
    void query(String query);
    void disconnect();
}
