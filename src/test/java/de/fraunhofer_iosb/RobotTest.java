package de.fraunhofer_iosb;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTest {

    @Test
    public void testMoveNorth() {
        Table table = new Table(5, 5);
        Robot robot = new Robot(1, 2, "N");

        robot.move(table);
        assertEquals("0 2 N", robot.toString());
    }

    @Test
    public void testRotateLeft() {
        Table table = new Table(5, 5);
        Robot robot = new Robot(1, 2, "N");
        robot.rotateLeft();
        assertEquals("1 2 W", robot.toString());
    }

    @Test
    public void testRotateRight() {
        Robot robot = new Robot(1, 2, "N");

        robot.rotateRight();
        assertEquals("1 2 E", robot.toString());
    }
}