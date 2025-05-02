package org.example.factoryPattern.connection;

public interface DatabaseConnection {
    void connect();
    void query(String query);
    void disconnect();
}
