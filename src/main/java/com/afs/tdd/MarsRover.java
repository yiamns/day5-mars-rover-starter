package com.afs.tdd;

public class MarsRover {
    public static String roverMove(LocationDirection input, String command) {
        if (command.equals("M")) {
            if (input.getDirection().equals("N")) {
                input.setY(input.getY() + 1);
                return input.toString();
            }
            if (input.getDirection().equals("S")) {
                input.setY(input.getY() - 1);
                return input.toString();
            }
            if (input.getDirection().equals("E")) {
                input.setX(input.getX() + 1);
                return input.toString();
            }
            if (input.getDirection().equals("W")) {
                input.setX(input.getX() - 1);
                return input.toString();
            }
        } else if (command.equals("L")) {
            if (input.getDirection().equals("N")) {
                input.setDirection("W");
                return input.toString();
            }
            if (input.getDirection().equals("W")) {
                input.setDirection("S");
                return input.toString();
            }
            if (input.getDirection().equals("S")) {
                input.setDirection("E");
                return input.toString();
            }
            if (input.getDirection().equals("E")) {
                input.setDirection("N");
                return input.toString();
            }
        } else if (command.equals("R")) {
            if (input.getDirection().equals("N")) {
                input.setDirection("E");
                return input.toString();
            }
            if (input.getDirection().equals("E")) {
                input.setDirection("S");
                return input.toString();
            }
            if (input.getDirection().equals("S")) {
                input.setDirection("W");
                return input.toString();
            }
            if (input.getDirection().equals("W")) {
                input.setDirection("N");
                return input.toString();
            }
        }
        return null;
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


