package de.fraunhofer_iosb;

import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    @Test
    public void testMoveNorth() {
        Surface table = new Table(5, 5);
        Movable robot = new Robot(1, 2, "N");

        robot.move(table);
        assertEquals("0 2 N", robot.toString());
    }

    @Test
    public void testRotateLeft() {
        Movable robot = new Robot(1, 2, "N");
        robot.rotateLeft();
        assertEquals("1 2 W", robot.toString());
    }

    @Test
    public void testRotateRight() {
        Movable robot = new Robot(1, 2, "N");

        robot.rotateRight();
        assertEquals("1 2 E", robot.toString());
    }

    @Test
    public void checkAtEdge(){
        Surface table = new Table(5, 5);
        Movable robot = new Robot(0, 2, "N");
        Command.execute("M",robot, table);
        assertEquals("0 2 N",robot.toString());
    }
}