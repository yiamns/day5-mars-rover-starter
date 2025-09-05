package com.afs.tdd.command;

import com.afs.tdd.LocationDirection;

public class LeftCommand implements Command {
    @Override
    public void execute(LocationDirection rover) {
        switch (rover.getDirection()) {
            case "N": rover.setDirection("W"); break;
            case "W": rover.setDirection("S"); break;
            case "S": rover.setDirection("E"); break;
            case "E": rover.setDirection("N"); break;
        }
    }
}
