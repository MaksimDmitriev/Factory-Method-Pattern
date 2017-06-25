package com.maze.core;

import com.sun.istack.internal.NotNull;

final class Maze {

    private final MapSite[] mData;
    private final int mWidth;
    private final int mHeight;
    private int mIndex;

    Maze(int width, int height) {
        mWidth = width;
        mHeight = height;
        mData = new MapSite[width * height];
        mIndex = mData.length / 2;
        mData[mIndex] = new Room();
    }

    // TODO: throw IllegalArgumentException vs return false when running off the maze
    void addRoom(@NotNull Direction direction) {
        addMapSite(direction, new Room());
    }

    void addWall(@NotNull Direction direction) {
        addMapSite(direction, new Wall());
    }

    void addDoor(@NotNull Direction direction) {
        addMapSite(direction, new Door());
    }

    private void addMapSite(@NotNull Direction direction, @NotNull MapSite mapSite) {
        int result = -1;
        switch (direction) {
            case NORTH:
                result = mIndex + mWidth;
                break;
            case SOUTH:
                result = mIndex - mWidth;
                break;
            case EAST:
                result = mIndex + 1;
                break;
            case WEST:
                result = mIndex - 1;
                break;
        }
        checkIndex(result);
        mIndex = result;
        mData[mIndex] = mapSite;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= mData.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
