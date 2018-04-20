package com.dagger2.wenbchen.daggertest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class BoardModule {
    @Provides
    @Singleton
    Block[][] provideBlock() {
        Block[][] board = new Block[1][1];
        board[0][0] = new Block(0, 0, "piece_name");
        return board;
    }
}
