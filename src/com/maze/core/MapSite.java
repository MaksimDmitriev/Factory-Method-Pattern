package com.maze.core;

abstract class MapSite {

    private final MapSite[] sites = new MapSite[Direction.values().length];

    final MapSite setSite(Direction direction, MapSite mapSite) {
        return sites[direction.getIndex()] = mapSite;
    }

    abstract void enter();
}
