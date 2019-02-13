package com.dagger2.wenbchen.daggertest;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PlayerModule.class, CacheModule.class})
public interface ChessGameShopComponent {
    void inject(ChessGameApp chessGameApp);
}
