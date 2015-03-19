package com.example.yanghonam.mytour;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by Yanghonam on 2015. 3. 17..
 */
public class PlaceActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_activity);
    }

    public void onClick(View v) {

        MyMapFragment map_frag;
        MyInfoFragment info_frag;

        if(v == findViewById(R.id.button_mapit)) {
            map_frag = new MyMapFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_place, map_frag).commit();
        } else {
            info_frag = new MyInfoFragment();
            getFragmentManager().beginTransaction().add(R.id.fragment_place, info_frag).commit();
        }
    }
}
