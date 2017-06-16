package com.cxrod.boilerplate.injection.component;

import android.app.Application;
import android.content.Context;

import com.cxrod.boilerplate.BoilerplateApplication;
import com.cxrod.boilerplate.data.DataManager;
import com.cxrod.boilerplate.injection.ApplicationContext;
import com.cxrod.boilerplate.injection.module.ApplicationModule;
import com.cxrod.boilerplate.service.SyncService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by crodriguez on 6/14/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BoilerplateApplication app);

    void inject(SyncService service);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}