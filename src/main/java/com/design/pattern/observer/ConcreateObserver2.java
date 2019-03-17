package com.design.pattern.observer;

public class ConcreateObserver2 implements Observer {

    @Override
    public void update(String name) {
        System.out.println("ConcreateObserver2收到了信息：" + name + "发生了变化");
    }
}
