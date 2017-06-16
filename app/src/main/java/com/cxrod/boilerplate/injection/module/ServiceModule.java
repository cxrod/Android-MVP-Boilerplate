package com.cxrod.boilerplate.injection.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by crodriguez on 6/14/17.
 */

@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}