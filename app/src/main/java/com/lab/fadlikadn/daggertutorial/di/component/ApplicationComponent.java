package com.lab.fadlikadn.daggertutorial.di.component;

import android.app.Application;
import android.content.Context;

import com.lab.fadlikadn.daggertutorial.di.annotation.ApplicationContext;
import com.lab.fadlikadn.daggertutorial.application.DemoApplication;
import com.lab.fadlikadn.daggertutorial.data.helper.DbHelper;
import com.lab.fadlikadn.daggertutorial.data.helper.SharedPrefsHelper;
import com.lab.fadlikadn.daggertutorial.data.DataManager;
import com.lab.fadlikadn.daggertutorial.di.module.ApplicationModule;

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
