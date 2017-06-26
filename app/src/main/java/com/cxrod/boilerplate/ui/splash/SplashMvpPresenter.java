package com.cxrod.boilerplate.ui.splash;

import com.cxrod.boilerplate.injection.PerActivity;
import com.cxrod.boilerplate.ui.base.MvpPresenter;

/**
 * Created by crodriguez on 6/26/17.
 */

@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

}
