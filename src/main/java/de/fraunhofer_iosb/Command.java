package de.fraunhofer_iosb;

import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;

public class Command {

    public static void execute(String command, Movable robot, Surface table) {
        for (char c : command.toCharArray()) {
            switch (c) {
                case 'M': robot.move(table); break;
                case 'L': robot.rotateLeft(); break;
                case 'R': robot.rotateRight(); break;
            }
        }
    }
}
