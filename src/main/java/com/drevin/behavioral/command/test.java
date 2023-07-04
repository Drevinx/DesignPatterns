package com.drevin.behavioral.command;

public class test {

    public static void main(String[] args) {

        Television television = new Television();
        RemoteController remoteController = new RemoteController();
        TurnOnCommand turnOnCommand = new TurnOnCommand(television);

        turnOnCommand.execute();
    }
}
