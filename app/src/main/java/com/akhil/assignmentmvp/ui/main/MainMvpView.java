
package com.akhil.assignmentmvp.ui.main;

import com.akhil.assignmentmvp.data.model.EventsDatum;
import com.akhil.assignmentmvp.ui.base.MvpView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public interface MainMvpView extends MvpView {

    void showData(LinkedHashMap<String,ArrayList<EventsDatum>> hashMap);

    void showError(String error);
}
