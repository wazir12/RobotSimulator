package de.fraunhofer_iosb.factory;

import de.fraunhofer_iosb.command.MoveCommand;
import de.fraunhofer_iosb.command.RotateLeftCommand;
import de.fraunhofer_iosb.command.RotateRightCommand;
import de.fraunhofer_iosb.contract.Command;

public class CommandFactory {
    public static Command getCommand(char commandChar) {
        switch (commandChar) {
            case 'M': return new MoveCommand();
            case 'L': return new RotateLeftCommand();
            case 'R': return new RotateRightCommand();
            default: throw new IllegalArgumentException("Invalid command: " + commandChar);
        }
    }
}
