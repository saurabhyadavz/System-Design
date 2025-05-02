package org.example.factoryPattern;

import org.example.factoryPattern.connection.DatabaseConnection;
import org.example.factoryPattern.connection.factory.DatabaseFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        String dbFromConfig = "MYSQL";

        DatabaseConnection connection = DatabaseFactory.createConnection(dbFromConfig);
        connection.connect();
        connection.query("select * from users");
        connection.disconnect();
    }
}
