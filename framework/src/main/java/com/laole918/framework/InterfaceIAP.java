package com.laole918.framework;

import java.util.Map;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public interface InterfaceIAP {
    void payForProduct(Map<String, String> product);

    String getPluginId();
}
