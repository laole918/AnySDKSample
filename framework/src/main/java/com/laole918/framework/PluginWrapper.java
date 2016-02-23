package com.laole918.framework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

import java.util.Vector;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class PluginWrapper {
    private static final String TAG = PluginWrapper.class.getSimpleName();
    static Context sContext = null;
    protected static Handler sMainThreadHandler = null;
    private static Vector<IActivityCallback> mActivityCallback = new Vector();

    public PluginWrapper() {
    }

    public static void init(Context context) {
        sContext = context;
        if(context != null && sContext instanceof Activity) {
            sContext = ((Activity)sContext).getWindow().getDecorView().getContext();
        }
        if(sMainThreadHandler == null) {
            sMainThreadHandler = new Handler(Looper.getMainLooper());
        }
    }

    public static void onActivityResult(int requestCode, int resultCode, Intent data) {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onActivityResult(requestCode, resultCode, data);
        }

    }

    public static void onPause() {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onPause();
        }

    }

    public static void onResume() {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onResume();
        }

    }

    public static void onNewIntent(Intent intent) {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onNewIntent(intent);
        }

    }

    public static void onStop() {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onStop();
        }

    }

    public static void onDestroy() {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onDestroy();
        }

    }

    public static void onRestart() {
        for(int i = 0; i < mActivityCallback.size(); ++i) {
            ((IActivityCallback)mActivityCallback.get(i)).onRestart();
        }

    }

    public static void setActivityCallback(IActivityCallback var0) {
        mActivityCallback.add(var0);
    }

    protected static Object initPlugin(String var0) {
        PluginHelper.LogI(TAG, "class name : ----" + var0 + "----");

        Class var1;
        Context var2;
        try {
            String var10000 = var0.replace('/', '.');
            var2 = null;
            var1 = Class.forName(var10000);
        } catch (ClassNotFoundException var4) {
            PluginHelper.LogE(TAG, "Class " + var0 + " not found.");
            var4.printStackTrace();
            return null;
        }

        try {
            if((var2 = getContext()) != null) {
                return var1.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{var2});
            }

            PluginHelper.LogE(TAG, "Plugin " + var0 + " wasn\'t initialized.");
        } catch (Exception var3) {
            var3.printStackTrace();
        }
        return null;
    }

    public static Context getContext() {
        return sContext;
    }

    public static void runOnMainThread(Runnable var0) {
        if(sMainThreadHandler != null) {
            sMainThreadHandler.post(var0);
        } else {
            if(sContext != null && sContext instanceof Activity) {
                ((Activity)sContext).runOnUiThread(var0);
            }

        }
    }
}
