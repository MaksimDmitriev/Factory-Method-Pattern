package com.maze;

abstract class MapSite {

    private final MapSite[] sites = new MapSite[Direction.values().length];

    abstract void enter();
}
