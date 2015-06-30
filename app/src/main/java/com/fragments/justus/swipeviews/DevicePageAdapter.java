package com.fragments.justus.swipeviews;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by justus on 5/4/15.
 */
public class DevicePageAdapter extends FragmentPagerAdapter {

    String[] devices;
    String[] devicedescription; //{"Android-One o phones","windows- Not open and not wid","iphone-good OS but closed for minority few"};

    public DevicePageAdapter(FragmentManager fm,Context context) {
        super(fm);

        Resources resources = context.getResources();
        devices = resources.getStringArray(R.array.devices);
        devicedescription = resources.getStringArray(R.array.device_description);


    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();
        bundle.putString(DeviceManagement.Descriptionkey, devicedescription[position]);
        Log.d("STRING",devicedescription[position]);
        bundle.putInt(DeviceManagement.ImageIDkey, getDeviceImageID(position));

        DeviceManagement deviceManagement = new DeviceManagement();
        deviceManagement.setArguments(bundle);
        return deviceManagement;
    }

    private int getDeviceImageID(int position){
        int id = 0;

        switch (position){
            case 0:
                id = R.drawable.android;
                break;
            case 1:
                id =R.drawable.ios;
                break;
            case 2:
                id = R.drawable.windows;
                break;


        }
        return id;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return devices[position];
    }

    @Override
    public int getCount() {
        return devices.length;
    }
}
