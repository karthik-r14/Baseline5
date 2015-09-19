package com.pathashala.baseline5;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class TestReadInput {

    @Test
    public void shouldReturnInputStringWhenReadIsCalled() {
        String line1 = "X-X-";
        final ByteArrayInputStream inContent = new ByteArrayInputStream(line1.getBytes());
        System.setIn(inContent);

        ReadInput input = new ReadInput(new Scanner(System.in));

        assertEquals("X-X-", input.read());
    }
}