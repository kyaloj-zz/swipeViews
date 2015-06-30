package com.fragments.justus.swipeviews;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by justus on 5/4/15.
 */
public class DeviceManagement extends Fragment {

    public static final String ImageIDkey = "imagekey";
    public static final String Descriptionkey = "descriptionkey";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment,container,false);

        Bundle bundle = getArguments();
        if (bundle != null){
            int imageID = bundle.getInt(ImageIDkey);
            String description = bundle.getString(Descriptionkey);

            setValues(view, imageID, description);



    }
        return view;
}

    private void setValues(View view, int imageID, String description) {
        ImageView imageview = (ImageView)view.findViewById(R.id.imageView);
        imageview.setImageResource(imageID);

        TextView textview = (TextView)view.findViewById(R.id.txtViewDesc);
    }
    }
