

package com.akhil.assignmentmvp.ui.main;


import com.akhil.assignmentmvp.ui.base.MvpPresenter;

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    void getData();

}
