package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;
import javax.inject.Named;

class CacheManagerPersist {

    private final CacheInterface cacheInterface;

    @Inject
    CacheManagerPersist(@Named("cache_persist") CacheInterface cacheInterface) {
        this.cacheInterface = cacheInterface;
    }

    String get(String key) {
        return cacheInterface.get(key);
    }
}
