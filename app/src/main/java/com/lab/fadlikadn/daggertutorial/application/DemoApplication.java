package com.lab.fadlikadn.daggertutorial.application;

import android.app.Application;
import android.content.Context;

import com.lab.fadlikadn.daggertutorial.component.ApplicationComponent;
import com.lab.fadlikadn.daggertutorial.component.DaggerApplicationComponent;
import com.lab.fadlikadn.daggertutorial.manager.DataManager;
import com.lab.fadlikadn.daggertutorial.module.ApplicationModule;

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
