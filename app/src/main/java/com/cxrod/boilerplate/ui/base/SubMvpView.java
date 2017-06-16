package com.cxrod.boilerplate.ui.base;

/**
 * Created by crodriguez on 6/16/17.
 */

public interface SubMvpView extends MvpView {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(MvpView mvpView);
}

