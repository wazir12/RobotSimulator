package de.fraunhofer_iosb;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testCommandSequence() {
        Table table = new Table(5, 5);
        Robot robot = new Robot(1, 2, "S");

        Command.execute("MRMLM", robot, table);
        assertEquals("3 1 S", robot.toString());
    }

    @Test
    public void testSecondCommandSequence() {
        Table table = new Table(5, 6);
        Robot robot = new Robot(1, 2, "N");

        Command.execute("MRMLRMM", robot, table);
        assertEquals("0 5 E", robot.toString());
    }
}