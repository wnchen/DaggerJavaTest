package com.dagger2.wenbchen.daggertest;

import javax.inject.Singleton;

import dagger.Component;

public class ChessGameApp {
    @Singleton
    @Component(modules = {PlayerModule.class, CacheModule.class})
    public interface ChessGameShopComponent {
        ChessGame chessGame();
        CacheManagerPersist cacheManagerPersist();
        CacheManagerNonPersist cacheManagerNonPersist();
    }

    public static void main(String[] args) {
        ChessGameShopComponent chessGameShop = DaggerChessGameApp_ChessGameShopComponent.builder().build();
        chessGameShop.chessGame().play();
        String persistCache = chessGameShop.cacheManagerPersist().get("key");
        System.out.printf("persiste cache is %s\n", persistCache);

        String nonPersistCache = chessGameShop.cacheManagerNonPersist().get("key");
        System.out.printf("non persiste cache is %s\n", persistCache);
        int count = 0;
    }
}
