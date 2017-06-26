package com.cxrod.boilerplate.ui.splash;

import com.cxrod.boilerplate.ui.base.MvpView;

/**
 * Created by crodriguez on 6/26/17.
 */

public interface SplashMvpView extends MvpView {

    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}

