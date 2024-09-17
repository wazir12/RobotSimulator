package de.fraunhofer_iosb.moveable_objects;

import de.fraunhofer_iosb.contract.Orientation;
import de.fraunhofer_iosb.contract.Movable;
import de.fraunhofer_iosb.contract.Surface;

public class Robot implements Movable {
    private int row;
    private int col;
    private Orientation orientation;

    public Robot(int row, int col, Orientation orientation) {
        this.row = row;
        this.col = col;
        this.orientation = orientation;
    }



    @Override
    public void move(Surface surface) {
         orientation.move(this,surface);
    }

    public void rotateLeft() {
        orientation = orientation.rotateLeft();
    }

    public void rotateRight() {
        orientation = orientation.rotateRight();
    }

    @Override
    public String toString() {
        return row + " " + col + " " + orientation.toString();
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
