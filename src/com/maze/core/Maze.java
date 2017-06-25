package com.maze.core;

final class Maze {

    private MapSite lastMapSite = new Room();

    void addRoom(Direction direction) {
        lastMapSite = lastMapSite.setSite(direction, new Room());
    }

    void addWall(Direction direction) {
        lastMapSite = lastMapSite.setSite(direction, new Wall());
    }

    void addDoor(Direction direction) {
        lastMapSite = lastMapSite.setSite(direction, new Door());
    }

}
