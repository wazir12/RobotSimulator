package de.fraunhofer_iosb.moveable_objects;

import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;

public class Robot implements Movable {
    private int row;
    private int col;
    private String orientation;

    public Robot(int row, int col, String orientation) {
        this.row = row;
        this.col = col;
        this.orientation = orientation;
    }



    @Override
    public void move(Surface surface) {
        switch (orientation) {
            case "N": if (surface.isValidPosition(row - 1, col)) row--; break;
            case "S": if (surface.isValidPosition(row + 1, col)) row++; break;
            case "E": if (surface.isValidPosition(row, col + 1)) col++; break;
            case "W": if (surface.isValidPosition(row, col - 1)) col--; break;
        }
    }

    public void rotateLeft() {
        switch (orientation) {
            case "N":
                orientation = "W";
                break;
            case "W":
                orientation = "S";
                break;
            case "S":
                orientation = "E";
                break;
            case "E":
                orientation = "N";
                break;
            default:
                break;
        }
    }

    public void rotateRight() {
        switch (orientation) {
            case "N":
                orientation = "E";
                break;
            case "E":
                orientation = "S";
                break;
            case "S":
                orientation = "W";
                break;
            case "W":
                orientation = "N";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return row + " " + col + " " + orientation;
    }
}
