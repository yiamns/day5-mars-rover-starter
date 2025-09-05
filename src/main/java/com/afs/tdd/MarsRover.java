package com.afs.tdd;

import com.afs.tdd.command.CommandFactory;

import java.util.Arrays;

public class MarsRover {
    public static String roverBatchMove(LocationDirection input, String[] commands) {
        Arrays.stream(commands)
                .map(CommandFactory::getCommand)
                .forEach(cmd -> cmd.execute(input));
        return input.toString();
    }
}
