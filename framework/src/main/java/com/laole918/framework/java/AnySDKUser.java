package com.laole918.framework.java;


/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class AnySDKUser {
    private static AnySDKListener _listener = null;
    private static AnySDKUser _instance;

    public AnySDKUser() {
    }

    public static AnySDKUser getInstance() {
        if(null == _instance) {
            _instance = new AnySDKUser();
        }

        return _instance;
    }

    public void login() {

    }

    public void login(String serverID) {

    }

    public void login(String serverID, String oauthLoginServer) {

    }

    public boolean isLogined() {
        return false;
    }

    public void setListener(AnySDKListener listener) {
        _listener = listener;
    }

    public String getUserID() {
        return null;
    }

    public String getPluginId() {
        return null;
    }

    public boolean isFunctionSupported(String functionName) {
        return false;
    }

    private static void onCallBack(int code, String msg) {
        if(_listener != null) {
            _listener.onCallBack(code, msg);
        }

    }
}
