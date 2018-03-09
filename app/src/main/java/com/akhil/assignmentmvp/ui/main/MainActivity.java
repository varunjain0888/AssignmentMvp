

package com.akhil.assignmentmvp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;


import com.akhil.assignmentmvp.R;
import com.akhil.assignmentmvp.data.model.EventsDatum;
import com.akhil.assignmentmvp.databinding.ActivityMainBinding;
import com.akhil.assignmentmvp.ui.base.BaseActivity;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.inject.Inject;




public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter<MainMvpView> mMainPresenter;

    @Inject
    CheckInHistorySectionListAdapter mAdapter;

    private ActivityMainBinding binding;

    public static Intent getStartIntent(Context context) {

        Intent intent = new Intent(context, MainActivity.class);

        return intent;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityComponent().inject(this);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        mMainPresenter.attachView(this);

        binding.searchResults.setAdapter(mAdapter);

        binding.searchResults.setLayoutManager(new LinearLayoutManager(this));

        mMainPresenter.getData();

    }


    @Override
    protected void onDestroy() {

        super.onDestroy();

        mMainPresenter.detachView();

    }

    @Override
    public void showData(LinkedHashMap<String,ArrayList<EventsDatum>> hashMap) {
        mAdapter.setData(hashMap,this);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String error) {

    }

}
