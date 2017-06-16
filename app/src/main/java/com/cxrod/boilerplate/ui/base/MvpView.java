package com.cxrod.boilerplate.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by crodriguez on 6/16/17.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

}