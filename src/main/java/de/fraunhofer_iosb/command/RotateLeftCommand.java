package de.fraunhofer_iosb.command;

import de.fraunhofer_iosb.contract.Command;
import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;

public class RotateLeftCommand implements Command {
    @Override
    public void execute(Movable robot, Surface table) {
        robot.rotateLeft();
    }
}
