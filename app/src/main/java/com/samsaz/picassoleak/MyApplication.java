package com.samsaz.picassoleak;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by mblcdr on 5/31/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
