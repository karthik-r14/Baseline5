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

    @Test
    public void shouldReturnAdjacentPositionForCellZeroOne() {

        Cell cell = new Cell(0, 1, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X"},
                {"X", "X"}
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(1, 0);
        positionXYMap.put(1, 1);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellOneZero() {

        Cell cell = new Cell(1, 0, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X"},
                {"X", "X"}
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(0, 1);
        positionXYMap.put(1, 1);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellOneOne() {

        Cell cell = new Cell(1, 1, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X"},
                {"X", "X"}
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(0, 1);
        positionXYMap.put(1, 0);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellZeroZeroOfAThreeXThreeMatrix() {

        Cell cell = new Cell(0, 0, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 1);
        positionXYMap.put(1, 0);
        positionXYMap.put(1, 1);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellZeroOneOfAThreeXThreeMatrix() {

        Cell cell = new Cell(0, 1, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(0, 2);
        positionXYMap.put(1, 0);
        positionXYMap.put(1, 1);
        positionXYMap.put(1, 2);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellZeroTwoOfAThreeXThreeMatrix() {

        Cell cell = new Cell(0, 2, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 1);
        positionXYMap.put(1, 1);
        positionXYMap.put(1, 2);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellOneZeroOfAThreeXThreeMatrix() {

        Cell cell = new Cell(1, 0, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(0, 1);
        positionXYMap.put(1, 1);
        positionXYMap.put(2, 0);
        positionXYMap.put(2, 1);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellOneOneOfAThreeXThreeMatrix() {

        Cell cell = new Cell(1, 1, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 0);
        positionXYMap.put(0, 1);
        positionXYMap.put(0, 2);
        positionXYMap.put(1, 0);
        positionXYMap.put(1, 2);
        positionXYMap.put(2, 0);
        positionXYMap.put(2, 1);
        positionXYMap.put(2, 2);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }

    @Test
    public void shouldReturnAdjacentPositionForCellOneTwoOfAThreeXThreeMatrix() {

        Cell cell = new Cell(1, 2, "x", new HashMap<Integer, Integer>());

        String[][] sample = new String[][]{{"X", "X", "-"},
                {"X", "-", "X"},
                {"-", "X", "-"},
        };

        HashMap<Integer, Integer> positionXYMap = new HashMap<>();

        positionXYMap.put(0, 1);
        positionXYMap.put(0, 2);
        positionXYMap.put(1, 1);
        positionXYMap.put(2, 1);
        positionXYMap.put(2, 2);

        assertEquals(positionXYMap, cell.computePositionOfAdjacentCells(sample));
    }
}