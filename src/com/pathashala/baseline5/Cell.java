//A cell has a position(x-y), state and it can compute the position of the neighbouring cells
package com.pathashala.baseline5;

import java.util.ArrayList;

public class Cell {
    private int xPosition;
    private int yPosition;
    private ArrayList<String> adjacentCellPosition;
    private String state;

    public Cell(int xPosition, int yPosition, String state, ArrayList<String> adjacentCellPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.adjacentCellPosition = adjacentCellPosition;
        this.state = state;
    }

    public ArrayList<String> computePositionOfAdjacentCells(String pattern [][]) {

        adjacentCellPosition.add("01");
        adjacentCellPosition.add("10");
        adjacentCellPosition.add("11");
        return adjacentCellPosition;
    }
}