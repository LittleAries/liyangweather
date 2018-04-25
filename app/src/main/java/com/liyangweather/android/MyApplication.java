package com.liyangweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
        LitePal.initialize(context);//调用litepal初始化方法
    }

    public static Context getContext(){
        return context;
    }
}
