package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;

class CacheImpNonPersist implements CacheInterface {

    @Inject
    CacheImpNonPersist() {

    }

    @Override
    public String get(String key) {
        return "cache impl non persist";
    }

    @Override
    public void put(String key, String val) {

    }
}
