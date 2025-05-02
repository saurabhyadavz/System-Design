package org.example.factoryPattern.connection.factory;

import org.example.factoryPattern.connection.DatabaseConnection;
import org.example.factoryPattern.connection.impl.MongoDBConnection;
import org.example.factoryPattern.connection.impl.MySQLConnection;
import org.example.factoryPattern.connection.impl.PostgreSQLConnection;

public class DatabaseFactory {
    public static DatabaseConnection createConnection(String dbType) {
        if (dbType == null) {
            return null;
        }

        if (dbType.equalsIgnoreCase("MYSQL")) {
            return new MySQLConnection();
        } else if (dbType.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgreSQLConnection();
        } else if (dbType.equalsIgnoreCase("MONGODB")) {
            return new MongoDBConnection();
        }

        return null;
    }
}
