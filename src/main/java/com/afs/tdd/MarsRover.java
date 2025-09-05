package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    public static String roverBatchMove(LocationDirection input, String[] commands) {
        Arrays.stream(commands).forEach(command -> {
            switch (command) {
                case "F":
                    moveForward(input);
                    break;
                case "B":
                    moveBackward(input);
                    break;
                case "L":
                    turnLeft(input);
                    break;
                case "R":
                    turnRight(input);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command: " + command);
            }
        });

        return input.toString();
    }

    public static void moveForward(LocationDirection input) {
        switch (input.getDirection()) {
            case "N":
                input.setY(input.getY() + 1);
                break;
            case "S":
                input.setY(input.getY() - 1);
                break;
            case "E":
                input.setX(input.getX() + 1);
                break;
            case "W":
                input.setX(input.getX() - 1);
                break;
        }
    }

    public static void moveBackward(LocationDirection input) {
        switch (input.getDirection()) {
            case "N":
                input.setY(input.getY() - 1);
                break;
            case "S":
                input.setY(input.getY() + 1);
                break;
            case "E":
                input.setX(input.getX() - 1);
                break;
            case "W":
                input.setX(input.getX() + 1);
                break;
        }
    }

    public static void turnLeft(LocationDirection input) {
        switch (input.getDirection()) {
            case "N":
                input.setDirection("W");
                break;
            case "W":
                input.setDirection("S");
                break;
            case "S":
                input.setDirection("E");
                break;
            case "E":
                input.setDirection("N");
                break;
        }
    }

    public static void turnRight(LocationDirection input) {
        switch (input.getDirection()) {
            case "N":
                input.setDirection("E");
                break;
            case "E":
                input.setDirection("S");
                break;
            case "S":
                input.setDirection("W");
                break;
            case "W":
                input.setDirection("N");
                break;
        }
    }
}
