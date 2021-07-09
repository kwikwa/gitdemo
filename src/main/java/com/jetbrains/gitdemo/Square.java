package com.jetbrains.gitdemo;

public class Square implements Shape {
    @Override
    public int getNumberOfVertices() {
        return 6;
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }
}
