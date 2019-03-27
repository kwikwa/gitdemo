package com.jetbrains.gitdemo;

public class Square implements Shape {
    @Override
    public int getNumberOfVertices() {
        return 4;
    }

    @Override
    public int getNumberOfEdges() {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
