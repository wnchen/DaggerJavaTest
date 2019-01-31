package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;
import javax.inject.Named;

class CacheManagerNonPersist {

    private final CacheInterface cacheInterface;

    @Inject
    CacheManagerNonPersist(@Named("cache_non_persist") CacheInterface cacheInterface) {
        this.cacheInterface = cacheInterface;
    }

    String get(String key) {
        return cacheInterface.get(key);
    }
}
