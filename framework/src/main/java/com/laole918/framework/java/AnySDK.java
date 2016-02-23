package com.laole918.framework.java;

import android.app.Activity;

import com.laole918.framework.PluginHelper;
import com.laole918.framework.PluginWrapper;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class AnySDK {
    private static final String TAG = AnySDK.class.getSimpleName();
    private static AnySDK _instance;

    private AnySDK() {

    }

    public static AnySDK getInstance() {
        if(null == _instance) {
            _instance = new AnySDK();
        }
        return _instance;
    }

    public void init(Activity activity) {
        PluginHelper.LogD(TAG, "initPluginSystem...");
        PluginWrapper.init(activity);
    }

    public void setDebug(boolean debug) {
        PluginHelper.setDebug(debug);
    }

    public void release() {

    }

    public String getFrameworkVersion() {
        return "";
    }

    public boolean isUserPluginExist() {
        return true;
    }

    public boolean isIAPPluginExist() {
        return true;
    }

}
