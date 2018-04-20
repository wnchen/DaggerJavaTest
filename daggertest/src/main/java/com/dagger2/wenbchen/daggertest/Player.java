package com.dagger2.wenbchen.daggertest;

public class Player {

    private final String name;
    private final boolean canMove;

    Player(String name, boolean canMove) {
        this.name = name;
        this.canMove = canMove;
    }

    boolean isCanMove() {
        return canMove;
    }
}
