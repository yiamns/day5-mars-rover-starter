package com.afs.tdd.command;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {
    private static final Map<String, Command> commandMap = new HashMap<>();
    static {
        commandMap.put("F", new ForwardCommand());
        commandMap.put("B", new BackwardCommand());
        commandMap.put("L", new LeftCommand());
        commandMap.put("R", new RightCommand());
    }

    public static Command getCommand(String code) {
        Command command = commandMap.get(code);
        if (command == null) {
            throw new IllegalArgumentException("Invalid command: " + code);
        }
        return command;
    }
}
