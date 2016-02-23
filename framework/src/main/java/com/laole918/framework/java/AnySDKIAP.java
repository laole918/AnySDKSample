package com.laole918.framework.java;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class AnySDKIAP {
    private static final String TAG = AnySDKIAP.class.getSimpleName();
    private static AnySDKIAP _instance;
    private static AnySDKListener _listener = null;

    public AnySDKIAP() {
    }

    public static AnySDKIAP getInstance() {
        if(null == _instance) {
            _instance = new AnySDKIAP();
        }
        return _instance;
    }

    public void setListener(AnySDKListener listener) {
        _listener = listener;
    }

    public void payForProduct(String pluginID, Map<String, String> orders) {

    }

    public void resetPayState() {

    }

    public ArrayList<String> getPluginId() {
        return null;
    }

    private static void onCallBack(int code, String msg) {
        if(_listener != null) {
            _listener.onCallBack(code, msg);
        }

    }


}
