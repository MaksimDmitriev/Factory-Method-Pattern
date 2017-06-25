package com.maze;

enum Direction {

    NORTH(0), SOUTH(1), EAST(2), WEST(3);

    int index;

    Direction(int index) {
        this.index = index;
    }
}
