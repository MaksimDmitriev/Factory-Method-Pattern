package com.maze.core;

public class Player {

    private int x;
    private int y;

    void goLeft() {
        x--;
    }

    void goUp() {
        y++;
    }

    void goRight() {
        x++;
    }

    void goDown() {
        y--;
    }

}
