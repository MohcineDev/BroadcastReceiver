package com.example.broadcastr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

//create the class then add it in manifest
public class MyBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ///filter by the receiver action
        if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {
            Toast.makeText(context, "POWER CONNECTED", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals("android.intent.action.CAMERA_BUTTON")) {
            Toast.makeText(context, "CAMERA BUTTON", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            Toast.makeText(context, "HEADSET PLUG", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            Toast.makeText(context, "SCREEN ON", Toast.LENGTH_SHORT).show();
        } else if (intent.getAction().equals("android.intent.action.USER_UNLOCKED")) {
            Toast.makeText(context, "USER UNLOCKED", Toast.LENGTH_SHORT).show();
        }


    }
}
