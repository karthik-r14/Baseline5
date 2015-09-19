//A cell has a position(x-y), state and it can compute the position of the neighbouring cells
package com.pathashala.baseline5;

import java.util.HashMap;

public class Cell {
    private int xPosition;
    private int yPosition;
    private HashMap<Integer, Integer> adjacentCellPosition;
    private String state;

    public Cell(int xPosition, int yPosition, String state, HashMap<Integer, Integer> adjacentCellPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.adjacentCellPosition = adjacentCellPosition;
        this.state = state;
    }

    public HashMap<Integer, Integer> computePositionOfAdjacentCells(String pattern[][]) {

        adjacentCellPosition.put(0, 1);
        adjacentCellPosition.put(1, 0);
        adjacentCellPosition.put(1, 1);
        return adjacentCellPosition;
    }
}