package com.lab.fadlikadn.daggertutorial.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.lab.fadlikadn.daggertutorial.di.annotation.ApplicationContext;
import com.lab.fadlikadn.daggertutorial.di.annotation.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public  ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences providerSharedPrefs() {
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
