package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotateTest() {
        Solution solution = new Solution();
        int[][] inputOne = {{1,2,3},{4,5,6}, {7,8,9}};
        int[][] outputOne = {{7,4,1}, {8,5,2}, {9,6,3}};
        solution.rotate(inputOne);
        assertEquals(inputOne, outputOne);
        int[][] inputTwo = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] outputTwo = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        solution.rotate(inputTwo);
        assertEquals(inputTwo, outputTwo);
    }

}