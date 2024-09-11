package de.fraunhofer_iosb;

public class Table {
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
