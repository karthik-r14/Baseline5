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

        for (int row = 0; row < pattern.length; ++row) {
            for (int column = 0; column < pattern.length; ++column) {
                if (row != xPosition || column != yPosition) {
                    if (Math.abs(row - xPosition) <= 1 && Math.abs(column - yPosition) <= 1)
                        adjacentCellPosition.put(row, column);
                }
            }
        }
        return adjacentCellPosition;
    }

    public String computeNextState(String[][] pattern) {
        int neighbourAliveCount = 0;

        computePositionOfAdjacentCells(pattern);
        System.out.println(adjacentCellPosition);
        for (Integer xPosition : adjacentCellPosition.keySet()) {
            Integer yPosition = adjacentCellPosition.get(xPosition);
            if (pattern[xPosition][yPosition].equals("X"))
                neighbourAliveCount++;
        }

        if (neighbourAliveCount < 2)
            state = "-";
        else if (neighbourAliveCount == 2)
            state = "X";

        return state;
    }
}