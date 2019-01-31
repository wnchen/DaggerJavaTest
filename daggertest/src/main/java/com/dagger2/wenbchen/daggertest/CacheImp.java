package com.dagger2.wenbchen.daggertest;

import javax.inject.Inject;

class CacheImp implements CacheInterface {

    @Inject
    CacheImp() {

    }

    @Override
    public String get(String key) {
        return "cache impl persist";
    }

    @Override
    public void put(String key, String val) {

    }
}
