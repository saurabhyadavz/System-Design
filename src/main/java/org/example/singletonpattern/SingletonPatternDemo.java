package org.example.singletonpattern;

public class SingletonPatternDemo {
    public static void main(String [] args) {
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();

        if(dbConnection1 == dbConnection2) {
            System.out.println("Its a same instance");
        }

    }
}
