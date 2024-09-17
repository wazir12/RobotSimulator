package de.fraunhofer_iosb.Orientation;

import de.fraunhofer_iosb.contract.Orientation;
import de.fraunhofer_iosb.contract.Surface;
import de.fraunhofer_iosb.moveable_objects.Robot;

public class WestOrientation implements Orientation {
    @Override
    public void move(Robot robot, Surface surface) {
        int newCol = robot.getCol() - 1;
        if (surface.isValidPosition(robot.getRow(), newCol)) {
            robot.setCol(newCol);
        }
    }

    @Override
    public Orientation rotateLeft() {
        return new SouthOrientation();
    }

    @Override
    public Orientation rotateRight() {
        return new NorthOrientation();
    }

    @Override
    public String toString() {
        return "W";
    }
}
