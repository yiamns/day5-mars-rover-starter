package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoverTest {

    // 单步前进
    @Test
    public void should_return_x_1_y_2_N_when_x_1_y_1_forward_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"F"};
        String expected = "x=1, y=2, direction='N'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_0_S_when_x_1_y_1_forward_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String[] commands = {"F"};
        String expected = "x=1, y=0, direction='S'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_2_y_1_E_when_x_1_y_1_forward_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String[] commands = {"F"};
        String expected = "x=2, y=1, direction='E'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_0_y_1_W_when_x_1_y_1_forward_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String[] commands = {"F"};
        String expected = "x=0, y=1, direction='W'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    // 单步后退
    @Test
    public void should_return_x_1_y_0_N_when_x_1_y_1_backward_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"B"};
        String expected = "x=1, y=0, direction='N'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_2_S_when_x_1_y_1_backward_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String[] commands = {"B"};
        String expected = "x=1, y=2, direction='S'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_0_y_1_E_when_x_1_y_1_backward_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String[] commands = {"B"};
        String expected = "x=0, y=1, direction='E'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_2_y_1_W_when_x_1_y_1_backward_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String[] commands = {"B"};
        String expected = "x=2, y=1, direction='W'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    // 单步左转
    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_left_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"L"};
        String expected = "x=1, y=1, direction='W'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_left_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String[] commands = {"L"};
        String expected = "x=1, y=1, direction='S'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_left_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String[] commands = {"L"};
        String expected = "x=1, y=1, direction='E'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_left_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String[] commands = {"L"};
        String expected = "x=1, y=1, direction='N'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    // 单步右转
    @Test
    public void should_return_x_1_y_1_E_when_x_1_y_1_right_N() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"R"};
        String expected = "x=1, y=1, direction='E'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_S_when_x_1_y_1_right_E() {
        LocationDirection input = new LocationDirection(1, 1, "E");
        String[] commands = {"R"};
        String expected = "x=1, y=1, direction='S'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_W_when_x_1_y_1_right_S() {
        LocationDirection input = new LocationDirection(1, 1, "S");
        String[] commands = {"R"};
        String expected = "x=1, y=1, direction='W'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_1_N_when_x_1_y_1_right_W() {
        LocationDirection input = new LocationDirection(1, 1, "W");
        String[] commands = {"R"};
        String expected = "x=1, y=1, direction='N'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    // 批量命令
    @Test
    public void should_return_x_1_y_0_W_when_batch_commands_BLFB() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"B", "L", "F", "B"};
        String expected = "x=1, y=0, direction='W'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }

    @Test
    public void should_return_x_1_y_5_N_when_batch_commands_FFRRBB() {
        LocationDirection input = new LocationDirection(1, 1, "N");
        String[] commands = {"F", "F", "R", "R", "B", "B"};
        String expected = "x=1, y=5, direction='S'";

        String locationDirection = MarsRover.roverBatchMove(input, commands);

        assertEquals(expected, locationDirection);
    }
}
