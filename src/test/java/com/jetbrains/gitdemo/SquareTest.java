package com.jetbrains.gitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class SquareTest {
    @Test
    void shouldHaveFourCorners() {
        // given
        var square = new Square();

        // expect
        Assertions.assertEquals(4, square.getNumberOfVertices());
    }

    @Disabled("Not implemented")
    @Test
    void shouldConsistOfFourSides() {
        // given
        var square = new Square();

        // expect
        Assertions.assertEquals(4, square.getNumberOfEdges());
    }
}