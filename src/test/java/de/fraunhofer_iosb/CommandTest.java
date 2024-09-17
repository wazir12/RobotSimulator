package de.fraunhofer_iosb;

import de.fraunhofer_iosb.Orientation.NorthOrientation;
import de.fraunhofer_iosb.Orientation.SouthOrientation;
import de.fraunhofer_iosb.command.CommandExecutor;
import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;
import de.fraunhofer_iosb.moveable_objects.Robot;
import de.fraunhofer_iosb.surfaces.Table;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testCommandSequence() {
        Surface table = new Table(5, 5);
        Movable robot = new Robot(1, 2, new SouthOrientation());

        CommandExecutor.execute("MRMLM", robot, table);
        assertEquals("3 1 S", robot.toString());
    }

    @Test
    public void testSecondCommandSequence() {
        Surface table = new Table(5, 6);
        Movable robot = new Robot(1, 2, new NorthOrientation());

        CommandExecutor.execute("MRMLRMM", robot, table);
        assertEquals("0 5 E", robot.toString());
    }
}