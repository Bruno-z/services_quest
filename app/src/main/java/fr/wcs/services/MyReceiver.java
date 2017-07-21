package fr.wcs.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by apprenti on 10/04/17.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
            Intent myIntent = new Intent(MyService.INTENT_DISPLAY_NOTIF);
            myIntent.setClass(context, MyService.class); context.startService(myIntent);
        }
    }
}