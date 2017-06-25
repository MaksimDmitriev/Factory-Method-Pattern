package com.maze.core;

public class MazeGame {

    /* private final Player player;

    MazeGame(Player player) {
        this.player = player;
    } */

    public Maze createMaze() {
        Maze maze = new Maze();
        return maze;
    }

    Door createDoor() {
        return new Door();
    }

    Wall createWall() {
        return new Wall();
    }

    Room createRoom() {
        return new Room();
    }

}
