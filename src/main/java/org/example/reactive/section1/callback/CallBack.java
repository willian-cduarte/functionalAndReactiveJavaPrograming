package org.example.reactive.section1.callback;

public interface CallBack {

    void pushData(String data);
    void pushComplete();
    void pushError(Exception ex);
}
