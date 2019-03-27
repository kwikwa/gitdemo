package com.jetbrains.gitdemo;

public class Circle implements Shape {
    @Override
    public int getNumberOfVertices() {
        return 0;

    }

    @Override
    public int getNumberOfEdges() {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
