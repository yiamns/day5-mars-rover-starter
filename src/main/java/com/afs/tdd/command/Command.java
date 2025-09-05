package com.afs.tdd.command;

import com.afs.tdd.LocationDirection;

public interface Command {
    void execute(LocationDirection rover);
}
