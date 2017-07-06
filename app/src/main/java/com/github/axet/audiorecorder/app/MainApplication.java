package com.github.axet.audiorecorder.app;

import android.support.v7.preference.PreferenceManager;

import com.github.axet.audiorecorder.R;

public class MainApplication extends com.github.axet.audiolibrary.app.MainApplication {

    public static final String PREFERENCE_CONTROLS = "controls";
    public static final String PREFERENCE_TARGET = "target";

    public int getUserTheme() {
        return getTheme(this, R.style.RecThemeLight, R.style.RecThemeDark);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceManager.setDefaultValues(this, R.xml.pref_general, false);
    }

}
