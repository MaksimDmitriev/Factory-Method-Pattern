package com.maze.core;

enum Direction {

    NORTH(0), SOUTH(1), EAST(2), WEST(3);

    private int index;

    int getIndex() {
        return index;
    }

    Direction(int index) {
        this.index = index;
    }
}
