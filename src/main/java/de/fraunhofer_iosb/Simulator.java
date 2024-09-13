package de.fraunhofer_iosb;

import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;
import de.fraunhofer_iosb.moveable_objects.Robot;
import de.fraunhofer_iosb.surfaces.Table;

import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        while(toContinue){
            try {
                System.out.println("Enter table dimensions (rows columns):");
                int rows = scanner.nextInt();
                int cols = scanner.nextInt();
                Surface table = new Table(rows, cols);


                System.out.println("Enter robot's initial position and orientation (row column orientation):");
                int robotRow = scanner.nextInt();
                int robotCol = scanner.nextInt();
                String orientation = scanner.next();

                Movable robot = new Robot(robotRow, robotCol, orientation);

                System.out.println("Enter movement commands (e.g., MRMLRMM):");
                String commands = scanner.next();

                Command.execute(commands, robot, table);

                System.out.println("Final position: " + robot);

                System.out.println("Do you want to Continue (Y/N)?");
                toContinue = scanner.next().equalsIgnoreCase("Y");
            } catch(Exception e){
                System.out.println("Exiting the program gracefully... due to "+e.getMessage());
                e.printStackTrace();

            }
        }

        //Shutdown Hook, for graceful shutdown
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook triggered. Exiting the program gracefully...");
            scanner.close();
            System.out.println("Scanner closed. Program exited.");
        }));

    }
}