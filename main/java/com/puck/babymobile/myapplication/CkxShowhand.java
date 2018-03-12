package com.puck.babymobile.myapplication;

import android.util.Log;
import android.bluetooth.BluetoothAdapter;
import java.util.Set;
import android.bluetooth.BluetoothDevice;

/**
 * Created by puck on 2018/2/13.
 */

public class CkxShowhand {

    static void logme(String juzi){
        Log.d("ckx",juzi);

    }

    static void display(){
        Log.d("ckx","displaying ....\n");
    }
    static void blue(){

        Log.d("ckx","letsblue ...\n");

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            logme("no blue ...\n");
            // Device does not support Bluetooth
        }
        else{
            logme("blue me ...\n");
        }


    }

    static void binded(){
        BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
        Set<BluetoothDevice> devices = adapter.getBondedDevices();
        for(int i=0; i<devices.size(); i++)
        {
            BluetoothDevice device = (BluetoothDevice) devices.iterator().next();
            System.out.println(device.getName());
        }
    }
}
