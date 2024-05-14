package org.example.reactive.section11;

import java.util.List;

public class Box<T> {

    private List<T> list;

    public Box(List<T> list){
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}

/*
* public class Box<T> {

    private List<? extends Number> list;

    public Box(List<? extends Number> list){
        this.list = list;
    }

    public List<? extends Number> getList() {
        return list;
    }

    public void setList(List<? extends Number> list) {
        this.list = list;
    }
}*/
