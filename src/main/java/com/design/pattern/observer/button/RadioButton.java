package com.design.pattern.observer.button;

import java.util.ArrayList;
import java.util.List;

public class RadioButton implements Button {
    private String name;

    public RadioButton(String name) {
        this.name = name;
    }

    private List<OnClickListener> list = new ArrayList<>();
    @Override
    public void addOnClickListener(OnClickListener observer) {
        list.add(observer);
    }

    @Override
    public void removeOnClickListener(OnClickListener observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (OnClickListener listener : list) {
            listener.onclick(name);
        }
    }


    public void click() {
        notifyObserver();
    }
}
