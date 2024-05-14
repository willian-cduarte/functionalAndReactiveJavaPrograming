package org.example.reactive.section10.factory;

public class DatabaseFactory {
    public static Database getDatabase(String dbType) {
        Database database = null;
        if ("RDBMS".equalsIgnoreCase(dbType))
            database = new RDBMS();
        else database = new DBMS();

        return database;

    }
}
