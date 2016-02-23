package com.laole918.framework;

import android.content.Intent;

/**
 * Created by laole918 on 2016/2/23 0023.
 */
public interface IActivityCallback {

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void onPause();

    void onResume();

    void onNewIntent(Intent intent);

    void onStop();

    void onDestroy();

    void onRestart();
}
