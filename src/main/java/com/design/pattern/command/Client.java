package com.design.pattern.command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreateCommond(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.invoke();
    }
}
