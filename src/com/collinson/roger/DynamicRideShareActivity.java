package com.collinson.roger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;

public class DynamicRideShareActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View driverButton = findViewById(R.id.driver);
        driverButton.setOnClickListener(this);
        
        View riderButton = findViewById(R.id.rider);
        riderButton.setOnClickListener(this);
        
    }
    
    public void onClick(View v) {
    	switch (v.getId()) {
    	case R.id.driver:
    		Intent i = new Intent(this, Driver.class);
    		startActivity(i);
    		break;
    	case R.id.rider:
    		Intent j = new Intent(this, Rider.class);
    		startActivity(j);
    		break;
    	}
    }
       
}