package com.stare.out.volumecontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by rishabh on 3/8/17.
 */

public class VolumeControl extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        /*if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            int newVolume = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            int oldVolume = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);

            Log.d(TAG, "onReceive:" + String.valueOf(newVolume));
            Log.d(TAG, "onReceive:" + String.valueOf(oldVolume));

            if (newVolume != oldVolume) {

            }
        }*/
        context.startService(new Intent(context, MyService.class));

    }
}
