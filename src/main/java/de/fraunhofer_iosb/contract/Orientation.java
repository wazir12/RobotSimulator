package de.fraunhofer_iosb.contract;

import de.fraunhofer_iosb.moveable_objects.Robot;

public interface Orientation {
    void move(Robot robot, Surface surface);
    Orientation rotateLeft();
    Orientation rotateRight();
}
