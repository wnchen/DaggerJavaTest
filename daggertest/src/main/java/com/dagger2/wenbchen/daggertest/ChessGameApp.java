package com.dagger2.wenbchen.daggertest;

import javax.inject.Singleton;

import dagger.Component;

public class ChessGameApp {
    @Singleton
    @Component(modules = {PlayerModule.class})
    public interface ChessGameShopComponent {
        ChessGame chessGame();
    }

    public static void main(String[] args) {
        ChessGameShopComponent chessGameShop = DaggerChessGameApp_ChessGameShopComponent.builder().build();
        chessGameShop.chessGame().play();
    }
}
