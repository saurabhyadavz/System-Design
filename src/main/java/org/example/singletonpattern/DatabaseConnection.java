package org.example.singletonpattern;

public class DatabaseConnection {
    private static volatile DatabaseConnection dbInstance;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(dbInstance == null) {
            synchronized (DatabaseConnection.class) {
                if(dbInstance == null) {
                    dbInstance = new DatabaseConnection();
                }
            }
        }
        return dbInstance;
    }
}
