package com.example.admin.w4d4ex01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Admin on 8/10/2017.
 */

public class HellouService extends Service{
    private static final String TAG=HellouService.class.getSimpleName()+"_TAG";
    int startMode= START_STICKY;
    IBinder binder;
    boolean allowRebind;

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: Service Create");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return startMode;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return allowRebind;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    @Override
    public void onRebind(Intent intent) {
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: Service Destroyed");
    }
}
