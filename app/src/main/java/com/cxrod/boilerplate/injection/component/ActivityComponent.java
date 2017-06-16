package com.cxrod.boilerplate.injection.component;

import com.cxrod.boilerplate.injection.PerActivity;
import com.cxrod.boilerplate.injection.module.ActivityModule;

import dagger.Component;

/**
 * Created by crodriguez on 6/14/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

}

