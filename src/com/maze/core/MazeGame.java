package com.maze.core;

public class MazeGame {

    /* private final Player player;

    MazeGame(Player player) {
        this.player = player;
    } */

    public Maze createMaze() {
        Maze maze = new Maze(7, 3);
        MapSite startMapSite = maze.getCurrentMapSite();

        maze.addWall(Direction.EAST);
        maze.addWall(Direction.NORTH);
        maze.addWall(Direction.EAST);
        maze.addWall(Direction.EAST);

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
