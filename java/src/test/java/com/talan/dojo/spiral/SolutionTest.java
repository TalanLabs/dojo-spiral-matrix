package com.talan.dojo.spiral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SolutionTest {

    private void assertEqual(int[][] expected, int[][] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }


    @Test
    public void testEmptySpiral() {
        int[][] expected = {{}};
        int[][] actual = Solution.buildMatrixOfSize(0);
       assertEqual(expected, actual);
    }


    @Test
    public void testTrivialSpiral() {
        int[][] expected = {
                {1}
        };
        assertEqual(expected, Solution.buildMatrixOfSize(1));
    }

    @Test
    public void testSpiralOfSize2() {
        int[][] expected = {
                {1, 2},
                {4, 3}
        };
        assertEqual(expected, Solution.buildMatrixOfSize(2));
    }

    @Test
    public void testSpiralOfSize3() {
        int[][] expected = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };
        assertEqual(expected, Solution.buildMatrixOfSize(3));
    }

    @Test
    public void testSpiralOfSize4() {
        int[][] expected = {
                { 1,  2,  3,  4},
                {12, 13, 14,  5},
                {11, 16, 15,  6},
                {10,  9,  8,  7}
        };

        assertEqual(expected, Solution.buildMatrixOfSize(4));
    }

    @Test
    public void testSpiralOfSize5() {
        int[][] expected = {
                { 1,  2,  3,  4,  5},
                {16, 17, 18, 19,  6},
                {15, 24, 25, 20,  7},
                {14, 23, 22, 21,  8},
                {13, 12, 11, 10,  9}
        };

        assertEqual(expected, Solution.buildMatrixOfSize(5));
    }

}
