package com.drevin.behavioral.command;

public class test {

    public static void main(String[] args) {

        Television television = new Television();
        RemoteController remoteController = new RemoteController();
        Command turnOn = new TurnOnCommand(television);

        turnOn.execute();
    }
}
