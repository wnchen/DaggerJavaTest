package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

public class ChessGameApp {

    @Inject
    DaggerTestSolution daggerTestSolution;

    @Inject
    CacheManagerPersist cacheManagerPersist;

    @Inject
    CacheManagerNonPersist cacheManagerNonPersist;

    ChessGameApp() {
        inject();
    }

    private void inject() {
        ChessGameShopComponent chessGameShop = DaggerChessGameShopComponent.builder().build();
        chessGameShop.inject(this);
    }

    public static void main(String[] args) {
        ChessGameApp chessGameApp = new ChessGameApp();
        chessGameApp.daggerTestSolution.play();

        String persistCache = chessGameApp.cacheManagerPersist.get("key");
        System.out.printf("persiste cache is %s\n", persistCache);

        String nonPersistCache = chessGameApp.cacheManagerNonPersist.get("key");
        System.out.printf("non persiste cache is %s\n", persistCache);
        int count = 0;
    }
}
