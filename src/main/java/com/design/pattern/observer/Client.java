package com.design.pattern.observer;

public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ConcreateObserver1();
        Observer observer2 = new ConcreateObserver2();

        ConcreateSubject subject = new ConcreateSubject();
        subject.attach(observer1);
        subject.attach(observer2);


        subject.invoke("李鹏");
    }
}
