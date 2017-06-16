package com.cxrod.boilerplate.ui.base;

/**
 * Created by crodriguez on 6/16/17.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);

    void onDetach();

    void setUserAsLoggedOut();
}
