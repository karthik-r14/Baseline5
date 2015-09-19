package com.pathashala.baseline5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCell {

    @Test
    public void shouldReturnAdjacentPositionForCellZeroZero() {

        Cell cell = new Cell(0, 0, "x", new ArrayList<String>());

        String[][] sample = new String[][]{  {"X", "X"},
                                             {"X", "X"}
                                          };

        ArrayList<String> position = new ArrayList<>();
        position.add("01");
        position.add("10");
        position.add("11");

        assertEquals(position, cell.computePositionOfAdjacentCells(sample));
    }
}
