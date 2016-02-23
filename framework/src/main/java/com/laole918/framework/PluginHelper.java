package com.laole918.framework;

import android.util.Log;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class PluginHelper {

    private static boolean isDebug = true;

    public PluginHelper() {
    }

    public static void setDebug(boolean debug) {
        isDebug = debug;
    }

    public static void LogV(String tag, String msg) {
        if(isDebug) {
            Log.v(tag, msg);
        }
    }

    public static void LogE(String tag, String msg) {
        if(isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void LogE(String tag, String msg, Exception tr) {
        if(isDebug) {
            Log.e(tag, msg, tr);
        }
    }

    public static void LogD(String tag, String msg) {
        if(isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void LogI(String tag, String msg) {
        if(isDebug) {
            Log.i(tag, msg);
        }
    }

}
