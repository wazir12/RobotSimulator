package de.fraunhofer_iosb;

import de.fraunhofer_iosb.contract.Surface;

public class Table implements Surface {
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
