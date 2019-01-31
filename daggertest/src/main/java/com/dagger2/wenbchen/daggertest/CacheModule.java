package com.dagger2.wenbchen.daggertest;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module
abstract class CacheModule {

    @Named("cache_persist")
    @Binds
    abstract CacheInterface cacheInterface(CacheImp cacheImp);

    @Named("cache_non_persist")
    @Binds
    abstract CacheInterface cacheInterfaceNonPersist(CacheImpNonPersist cacheImp);
}
