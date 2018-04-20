package com.dagger2.wenbchen.daggertest;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = BoardModule.class)
class PlayerModule {
    @Provides
    @Singleton
    @Named("white_player")
    Player provideWhitePlayer() {
        return new Player("white", true);
    }

    @Provides
    @Singleton
    @Named("black_player")
    Player provideBlackPlayer() {
        return new Player("black", false);
    }
}
