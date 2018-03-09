
package com.akhil.assignmentmvp;

import android.app.Application;
import android.content.Context;

import com.akhil.assignmentmvp.injection.component.ApplicationComponent;
import com.akhil.assignmentmvp.injection.component.DaggerApplicationComponent;
import com.akhil.assignmentmvp.injection.module.ApplicationModule;
import com.androidnetworking.AndroidNetworking;

public class MyApplication extends Application {
    static Context context;
    ApplicationComponent mApplicationComponent;
    public static Context getContext() {
        return context;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        AndroidNetworking.initialize(getApplicationContext());
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        mApplicationComponent.inject(this);
    }

    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

}
