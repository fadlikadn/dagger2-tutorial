package com.lab.fadlikadn.daggertutorial.di.component;

import com.lab.fadlikadn.daggertutorial.MainActivity;
import com.lab.fadlikadn.daggertutorial.di.annotation.PerActivity;
import com.lab.fadlikadn.daggertutorial.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
