package de.fraunhofer_iosb;

public class Robot {
    private int row;
    private int col;
    private String orientation;

    public Robot(int row, int col, String orientation) {
        this.row = row;
        this.col = col;
        this.orientation = orientation;
    }

    public void move(Table table) {
        switch (orientation) {
            case "N": if (table.isValidPosition(row - 1, col)) row--; break;
            case "S": if (table.isValidPosition(row + 1, col)) row++; break;
            case "E": if (table.isValidPosition(row, col + 1)) col++; break;
            case "W": if (table.isValidPosition(row, col - 1)) col--; break;
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
