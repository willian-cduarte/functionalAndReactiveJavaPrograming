package org.example.functional.section15;

public class MapFunEntry {
    Object key;
    Object value;
    MapFunEntry next;

    public MapFunEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public MapFunEntry() {
        this.next = null;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MapFunEntry getNext() {
        return next;
    }

    public void setNext(MapFunEntry next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "key:"+key+" value:"+value + " next= " + next;
    }
}
