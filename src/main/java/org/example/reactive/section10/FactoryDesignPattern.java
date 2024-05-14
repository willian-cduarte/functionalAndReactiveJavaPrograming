package org.example.reactive.section10;

import org.example.reactive.section10.factory.Database;
import org.example.reactive.section10.factory.DatabaseFactory;

public class FactoryDesignPattern {
    public static void main(String[] args) {

        Database database = null;
        database = DatabaseFactory.getDatabase("RDBMS");

        System.out.println("Database : " + database.getClass().getSimpleName());
        System.out.println(database.connect());

        database = DatabaseFactory.getDatabase("DBMS");

        System.out.println("Database : " + database.getClass().getSimpleName());
        System.out.println(database.connect());
    }
}
