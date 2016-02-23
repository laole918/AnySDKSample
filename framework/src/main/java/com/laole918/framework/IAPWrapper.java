package com.laole918.framework;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public class IAPWrapper {
    public static final int PAYRESULT_SUCCESS = 0;
    public static final int PAYRESULT_FAIL = 1;
    public static final int PAYRESULT_CANCEL = 2;
    public static final int PAYRESULT_NETWORK_ERROR = 3;
    public static final int PAYRESULT_PRODUCTIONINFOR_INCOMPLETE = 4;
    public static final int PAYRESULT_INIT_SUCCESS = 5;
    public static final int PAYRESULT_INIT_FAIL = 6;
    public static final int PAYRESULT_NOW_PAYING = 7;
    public static final int PAYRESULT_RECHARGE_SUCCESS = 8;
    public static final int PAYRESULT_PAYEXTENSION = 30000;

    public IAPWrapper() {
    }

    public static void onPayResult(InterfaceIAP var0, int var1, String var2) {

    }
}
