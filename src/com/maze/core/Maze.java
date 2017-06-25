package com.maze.core;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

final class Maze {

    // TODO: how to add MapSites when their indices are less than zero? w=5, h=3. My init index is 7.
    // When I call addRoom(South), its index will be 2. If I call addRoom(South) again, its index is less than zero.
    private final List<MapSite> mData;
    private final int mWidth;
    private final int mHeight;
    private int mIndex;

    Maze(int initialWidth, int initialHeight) {
        mWidth = initialWidth;
        mHeight = initialHeight;
        mData = new ArrayList<>(initialWidth * initialHeight);
        mIndex = mData.size() / 2;
        mData.set(mIndex, new Room());
    }

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
        mData.set(mIndex, mapSite);
    }

    private boolean checkIndex(int index) {
        if (index < 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getX() {
        return mIndex % mWidth;
    }

    public int getY() {
        return mIndex / mWidth;
    }

    public MapSite getMapSite(int x, int y) {
        int index = x + y * mWidth;
        return mData.get(index);
    }

    public MapSite getCurrentMapSite() {
        return mData.get(mIndex);
    }
}
