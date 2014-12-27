package ua.org.horishniy.rpncalculator.utils;

import java.util.ArrayList;

/**
 * Created by rage on 27.12.14.
 *
 * This class realize FILO stack
 */
public class FiloStack<T> extends ArrayList<T> {

    //To add new element
    public void push(T t) {
        add(t);
    }

    //Get last element
    public T peek() {
        return get(size() - 1);
    }

    //Delete last element
    public void pop() {
        remove(size() - 1);
    }

    //Is empty
    public boolean empty() {
        return size() == 0;
    }

}
