package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject{
    private List<Observer> list = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        list.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver(String name) {
        for (Observer observer : list) {
            observer.update(name);
        }
    }


    public void invoke(String name) {
        for (int i = 0; i < 10; i++) {
            notifyObserver(name + i);
        }
    }
}
