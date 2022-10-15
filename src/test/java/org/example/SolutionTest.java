package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void solutionTest() {
        int [] actual = solution.getConcatenation(new int[]{1,2,3});
        int [] expected = new int []{1,2,3,1,2,3};

        Assertions.assertArrayEquals(expected,actual);
    }

}