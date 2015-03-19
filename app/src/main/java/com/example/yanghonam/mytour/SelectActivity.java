package com.example.yanghonam.mytour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Yanghonam on 2015. 3. 18..
 */
public class SelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_activity);
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_place1 :
                Intent plc1 = new Intent(this, PlaceActivity.class);
                startActivity(plc1);
                break;
            case R.id.button_place2 :
                break;
            case R.id.button_place3 :
                break;
            case R.id.button_place4 :
                break;
        }
    }
}
