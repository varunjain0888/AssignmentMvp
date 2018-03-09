

package com.akhil.assignmentmvp.data;

import com.akhil.assignmentmvp.data.listeners.DataListener;
import com.akhil.assignmentmvp.data.local.PreferencesHelper;
import com.akhil.assignmentmvp.data.model.EventsDatum;
import com.akhil.assignmentmvp.data.remote.ApiHelper;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class DataManager {

    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public DataManager(PreferencesHelper preferencesHelper, ApiHelper apiHelper) {
        this.mPreferencesHelper = preferencesHelper;
        this.mApiHelper = apiHelper;
    }

    public LinkedHashMap<String,ArrayList<EventsDatum>>  getData() {

        return mApiHelper.getData();

    }
}
