package com.afs.tdd.command;

import com.afs.tdd.LocationDirection;

public class BackwardCommand implements Command {
    @Override
    public void execute(LocationDirection rover) {
        switch (rover.getDirection()) {
            case "N": rover.setY(rover.getY() - 1); break;
            case "S": rover.setY(rover.getY() + 1); break;
            case "E": rover.setX(rover.getX() - 1); break;
            case "W": rover.setX(rover.getX() + 1); break;
        }
    }
}
