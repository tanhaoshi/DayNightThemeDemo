package com.falc.daynightthemedemo;

import android.app.Application;

public class App extends Application {

    public DayNightThemeManager themeManager;

    public static App INSTANCE;

    public static App getInstance(){
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        themeManager = new DayNightThemeManager(new SharedPreferencesManager(this));
    }
}