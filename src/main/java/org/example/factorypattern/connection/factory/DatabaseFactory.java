package org.example.factorypattern.connection.factory;

import org.example.factorypattern.connection.DatabaseConnection;
import org.example.factorypattern.connection.impl.MongoDBConnection;
import org.example.factorypattern.connection.impl.MySQLConnection;
import org.example.factorypattern.connection.impl.PostgreSQLConnection;

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
