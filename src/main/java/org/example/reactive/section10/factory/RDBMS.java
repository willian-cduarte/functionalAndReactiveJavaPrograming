package org.example.reactive.section10.factory;

public class RDBMS implements Database{

    @Override
    public String connect() {
        return "Connection successfully with RDBMS";
    }
}
