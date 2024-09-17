package de.fraunhofer_iosb.Orientation;

import de.fraunhofer_iosb.contract.Orientation;
import de.fraunhofer_iosb.contract.Surface;
import de.fraunhofer_iosb.moveable_objects.Robot;

public class NorthOrientation implements Orientation {
    @Override
    public void move(Robot robot, Surface surface) {
        int newRow = robot.getRow() - 1;
        if (surface.isValidPosition(newRow, robot.getCol())) {
            robot.setRow(newRow);
        }

    }

    @Override
    public Orientation rotateLeft() {
        return new WestOrientation();
    }

    @Override
    public Orientation rotateRight() {
        return new EastOrientation();
    }

    @Override
    public String toString() {
        return "N";
    }
}
