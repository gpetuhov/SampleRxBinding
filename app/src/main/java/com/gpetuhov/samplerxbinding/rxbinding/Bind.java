package com.gpetuhov.samplerxbinding.rxbinding;


import android.view.View;

import com.jakewharton.rxbinding2.view.RxView;

import java.util.concurrent.TimeUnit;

// Helper class for binding view with RxBinding
public class Bind {

    private static final int BUTTON_CLICK_INTERVAL = 1000;

    public static void click(final View view, final View.OnClickListener listener) {
        RxView.clicks( view )
                // Only first click within every 1 second interval will be passed to subscriber
                .throttleFirst( BUTTON_CLICK_INTERVAL, TimeUnit.MILLISECONDS )
                .subscribe( click -> listener.onClick( view ) );
    }
}
