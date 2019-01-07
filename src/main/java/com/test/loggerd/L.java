package com.test.loggerd;

import android.util.Log;

public class L {
    private static final String TAG = L.class.getSimpleName();

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
