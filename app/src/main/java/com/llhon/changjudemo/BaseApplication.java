package com.llhon.changjudemo;

import android.app.Application;
import android.content.Context;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

/**
 * Created by LLhon
 */
public class BaseApplication extends com.newproject.hardqing.base.a {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override public void onCreate() {
        super.onCreate();
    }
}
