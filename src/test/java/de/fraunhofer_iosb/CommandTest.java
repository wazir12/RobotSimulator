package de.fraunhofer_iosb;

import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testCommandSequence() {
        Surface table = new Table(5, 5);
        Movable robot = new Robot(1, 2, "S");

        Command.execute("MRMLM", robot, table);
        assertEquals("3 1 S", robot.toString());
    }

    @Test
    public void testSecondCommandSequence() {
        Surface table = new Table(5, 6);
        Movable robot = new Robot(1, 2, "N");

        Command.execute("MRMLRMM", robot, table);
        assertEquals("0 5 E", robot.toString());
    }
}