package de.fraunhofer_iosb;

public class Command {

    public static void execute(String command, Robot robot, Table table) {
        for (char c : command.toCharArray()) {
            switch (c) {
                case 'M': robot.move(table); break;
                case 'L': robot.rotateLeft(); break;
                case 'R': robot.rotateRight(); break;
            }
        }
    }
}
