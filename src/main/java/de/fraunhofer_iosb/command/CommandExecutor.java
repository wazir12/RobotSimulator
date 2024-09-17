package de.fraunhofer_iosb.command;

import de.fraunhofer_iosb.factory.CommandFactory;
import de.fraunhofer_iosb.contract.Command;
import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;

public class CommandExecutor {

    public static void execute(String command, Movable robot, Surface table) {
        for (char c : command.toCharArray()) {
            Command cm= CommandFactory.getCommand(c);
            cm.execute(robot,table);
        }
    }
}
