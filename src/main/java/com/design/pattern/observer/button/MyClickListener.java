package com.design.pattern.observer.button;

public class MyClickListener implements OnClickListener {

    @Override
    public void onclick(String name) {
        System.out.println("MyClickListener click :" + name);
    }
}
