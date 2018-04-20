package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;
import javax.inject.Named;

public class ChessGame {
    private final Player whitePlayer;
    private final Player blackPlayer;
    private final Block[][] board;

    @Inject
    ChessGame(@Named("black_player") Player blackPlayer, @Named("white_player") Player whitePlayer, Block[][] board) {
        this.blackPlayer = blackPlayer;
        this.whitePlayer = whitePlayer;
        this.board = board;
    }

    void play() {
        if (blackPlayer.isCanMove()) {
            System.out.println("black player move to board[0][0]");
        } else if (whitePlayer.isCanMove()){
            System.out.println("white player move to board[0][0]");
        }
    }
}

