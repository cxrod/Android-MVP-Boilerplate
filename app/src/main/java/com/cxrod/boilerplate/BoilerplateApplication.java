package com.cxrod.boilerplate;

import android.app.Application;

import com.cxrod.boilerplate.data.DataManager;
import com.cxrod.boilerplate.injection.component.ApplicationComponent;
import com.cxrod.boilerplate.injection.component.DaggerApplicationComponent;
import com.cxrod.boilerplate.injection.module.ApplicationModule;
import com.cxrod.boilerplate.util.AppLogger;

import javax.inject.Inject;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by crodriguez on 6/14/17.
 */

public class BoilerplateApplication extends Application{

    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
