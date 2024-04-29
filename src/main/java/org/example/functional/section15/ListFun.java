package org.example.functional.section15;

import java.util.Collection;
import java.util.function.Consumer;

public abstract class ListFun<T> {
    public abstract T head();

    public abstract ListFun<T> tail();

    public abstract boolean isEmpty();

    //@SuppressWarnings("rawTypes")
    public static final ListFun NIL = new Nil();

    private static class Nil<T> extends ListFun<T> {

        private Nil() {}
        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFun<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length() {
        int l = 0;

        ListFun<T> temp = this;
        while (!temp.equals(NIL)) {
            l++;
            temp = temp.tail();
        }
        return l;
    }

    private static class Const<T> extends ListFun<T> {
        private final T head;
        private final ListFun<T> tail;

        Const(T element, ListFun<T> list) {
            this.head = element;
            this.tail = list;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFun<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            //return length() == 0 ? true : false;
            return length() == 0;
        }
    }

    public static <T> ListFun<T> list() {
        return NIL;
    }

    public static <T> ListFun<T> list(T... t){
        ListFun<T> temp = list();
        for (T element: t) {
            temp = new Const<T>(element, temp);
        }
        return temp;
    }

    public ListFun<T> addElement(T element) {
        return new Const<T>(element, this);
    }

    //method to add element at specific position
    public ListFun<T> addElement(int position, T element) {
        if (position < 1 || position > length())
            throw new IndexOutOfBoundsException();
        if (position == 1)
            return this.tail().addElement(element);
        return new Const<T>(head(), tail().addElement(position-1, element));
    }

    public void forEach(Consumer<? super T> action) {
        T current = this.head();
        ListFun<T> temp = this;

        for (int i = 0; i < length(); i++) {
            action.accept(current);
            temp = temp.tail();
            current = temp.head();
        }
    }

    public ListFun<T> removeElement(T element) {
        if (this.length() == 0)
            return this;
        else if (element.equals(this.head()))
            return tail();
        else {
            ListFun<T> newTail = tail().removeElement(element);
            return new Const<T>(head(), newTail);
        }
    }

    //to remove from specific position
    public ListFun<T> removeElement(int position) {
        if (position < 0 || position > length())
            throw new IndexOutOfBoundsException();
        if (position == 0)
            return tail();
        return new Const<T>(head(), tail().removeElement(position - 1));
    }

    public ListFun<T> reverseList() {
        ListFun<T> list = list();
        T current = this.head();
        ListFun<T> temp = this;

        while (!temp.equals(NIL)) {
            list = list.addElement(current);
            temp = temp.tail();
            current = temp.head();
        }
        return list;
    }

    public static <T> ListFun<T> concat(ListFun<T> list1, ListFun<T> list2) {
        return list1.isEmpty()
                ? list2
                : new Const<T>(list1.head(), concat(list1.tail(), list2));
    }

    public ListFun<T> addAllElements(final Collection<? extends T> list) {
        ListFun<T> result = this;
        for (T t: list) {
            result = result.addElement(t);
        }
        return result;
    }

    public ListFun<T> clear() {
        return list();
    }

}
