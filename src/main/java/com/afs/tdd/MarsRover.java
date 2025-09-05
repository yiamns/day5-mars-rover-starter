package com.afs.tdd;

public class MarsRover {
    public static String roverMove(LocationDirection input, String command) {
        switch (command) {
            case "M":
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
                    default:
                        return null;
                }
                break;
            case "L":
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
                    default:
                        return null;
                }
                break;
            case "R":
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
                    default:
                        return null;
                }
                break;
            default:
                return null;
        }
        return input.toString();
    }

    public static String moveBackward(LocationDirection input) {
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
            default:
                return null;
        }
        return input.toString();
    }

}


