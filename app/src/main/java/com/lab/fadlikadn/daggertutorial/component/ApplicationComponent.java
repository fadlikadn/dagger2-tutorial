package com.lab.fadlikadn.daggertutorial.component;

import android.app.Application;
import android.content.Context;

import com.lab.fadlikadn.daggertutorial.annotation.ApplicationContext;
import com.lab.fadlikadn.daggertutorial.application.DemoApplication;
import com.lab.fadlikadn.daggertutorial.helper.DbHelper;
import com.lab.fadlikadn.daggertutorial.helper.SharedPrefsHelper;
import com.lab.fadlikadn.daggertutorial.manager.DataManager;
import com.lab.fadlikadn.daggertutorial.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}
