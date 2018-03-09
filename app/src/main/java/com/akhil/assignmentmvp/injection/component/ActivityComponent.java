
package com.akhil.assignmentmvp.injection.component;



import com.akhil.assignmentmvp.injection.annotation.PerActivity;
import com.akhil.assignmentmvp.injection.module.ActivityModule;
import com.akhil.assignmentmvp.ui.main.MainActivity;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
