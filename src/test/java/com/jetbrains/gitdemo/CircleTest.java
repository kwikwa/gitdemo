package com.jetbrains.gitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void shouldNotHaveAnyCorners() {
        // given
        var circle = new Circle();

        // expect
        Assertions.assertEquals(8, circle.getNumberOfVertices());
    }

    @Disabled("Not implemented")
    @Test
    void shouldConsistOfASingleLine() {
        // given
        var circle = new Circle();

        // expect
        Assertions.assertEquals(1, circle.getNumberOfEdges());
    }
}