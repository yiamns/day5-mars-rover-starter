package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_move_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String command = "M";
        String expected = "x=1, y=2, direction='N'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_move_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String command = "M";
        String expected = "x=1, y=0, direction='S'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_move_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String command = "M";
        String expected = "x=0, y=1, direction='W'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_2_y_1_E_when_x_1_y_1_move_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String command = "M";
        String expected = "x=2, y=1, direction='E'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String command = "L";
        String expected = "x=1, y=1, direction='W'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String command = "L";
        String expected = "x=1, y=1, direction='N'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String command = "L";
        String expected = "x=1, y=1, direction='E'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String command = "L";
        String expected = "x=1, y=1, direction='S'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String command = "R";
        String expected = "x=1, y=1, direction='E'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String command = "R";
        String expected = "x=1, y=1, direction='S'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String command = "R";
        String expected = "x=1, y=1, direction='W'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String command = "R";
        String expected = "x=1, y=1, direction='N'";

        String locationDirection = MarsRover.roverMove(input, command);

        assertEquals(expected, locationDirection);
    }
}
