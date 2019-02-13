package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;

class DaggerTestSolution {

    @Inject
    ChessGame chessGame;

    @Inject
    DaggerTestSolution() {

    }

    void play() {
        chessGame.play();
    }
}
