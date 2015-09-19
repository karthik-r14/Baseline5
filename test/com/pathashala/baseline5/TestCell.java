package com.pathashala.baseline5;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestCell {

    @Test
    public void shouldReturnAdjacentPositionForCellZeroZero() {

        Cell cell = new Cell(0, 0, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X"},
                {"X", "X"}
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 1);
        positionXYMap.put(1, 0);
        positionXYMap.put(1, 1);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }
}
