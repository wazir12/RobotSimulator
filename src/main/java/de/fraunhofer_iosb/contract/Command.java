package de.fraunhofer_iosb.contract;

public interface Command {
    void execute(Movable robot, Surface table);
}
