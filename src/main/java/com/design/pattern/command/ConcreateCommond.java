package com.design.pattern.command;

public class ConcreateCommond extends Command {

    public ConcreateCommond(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {

        receiver.action();
    }
}
