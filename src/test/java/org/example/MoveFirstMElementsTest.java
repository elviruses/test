package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.moveFirstMElementsToEnd;
import static org.example.Main.reverse;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveFirstMElementsTest {

    @Test
    public void testMoveFirstMElementsToEnd() {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int m = 4;
        moveFirstMElementsToEnd(A, m);
        int[] expected = new int[]{5, 6, 7, 8, 1, 2, 3, 4};
        assertArrayEquals(expected, A);
    }

    @Test
    public void testReverse() {
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        reverse(A, 2, 5);
        int[] expected = new int[]{1, 2, 6, 5, 4, 3, 7, 8};
        assertArrayEquals(expected, A);
    }
}
