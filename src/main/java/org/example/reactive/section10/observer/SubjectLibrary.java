package org.example.reactive.section10.observer;

public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);

    public void unsubscribeObserver(Observer ob);

    public void notifyObserver();

}
