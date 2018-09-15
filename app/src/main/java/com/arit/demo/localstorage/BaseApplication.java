package com.arit.demo.localstorage;

import android.app.Application;
import android.content.SharedPreferences;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {

        super.onCreate();
        SharedPreferences pref = getApplicationContext()
                .getSharedPreferences("settings",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("display-name","John Doe");
        editor.putBoolean("safe-mode",true);

        editor.apply();
    }
}
