
package com.akhil.assignmentmvp.ui.main;


import com.akhil.assignmentmvp.data.DataManager;
import com.akhil.assignmentmvp.data.listeners.DataListener;
import com.akhil.assignmentmvp.ui.base.BasePresenter;

import javax.inject.Inject;

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    private final DataManager mDataManager;

    @Inject
    public MainPresenter(DataManager dataManager) {
        this.mDataManager = dataManager;
    }

    @Override
    public void getData() {

        //getMvpView().showLoading();

        getMvpView().showData(mDataManager.getData());
    }
}
