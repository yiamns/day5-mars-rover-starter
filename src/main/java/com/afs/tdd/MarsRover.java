package com.afs.tdd;

public class MarsRover {

    public static String roverMove(LocationDirection input, String command) {
        switch (command) {
            case "M":
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
                return null;
        }
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
