package com.lab.fadlikadn.daggertutorial.component;

import com.lab.fadlikadn.daggertutorial.MainActivity;
import com.lab.fadlikadn.daggertutorial.annotation.PerActivity;
import com.lab.fadlikadn.daggertutorial.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
