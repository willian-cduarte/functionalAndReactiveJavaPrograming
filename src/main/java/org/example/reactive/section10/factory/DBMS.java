package org.example.reactive.section10.factory;

public class DBMS implements Database{
    @Override
    public String connect() {
        return "Connection successfully with DBMS";
    }
}
