package com.lab.fadlikadn.daggertutorial.application;

import android.app.Application;
import android.content.Context;

import com.lab.fadlikadn.daggertutorial.di.component.ApplicationComponent;
import com.lab.fadlikadn.daggertutorial.di.component.DaggerApplicationComponent;
import com.lab.fadlikadn.daggertutorial.data.DataManager;
import com.lab.fadlikadn.daggertutorial.di.module.ApplicationModule;

import javax.inject.Inject;

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                                .builder()
                                .applicationModule(new ApplicationModule(this))
                                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
