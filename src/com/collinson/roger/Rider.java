package com.collinson.roger;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;


public class Rider extends MapActivity {
	@Override
	protected boolean isRouteDisplayed() {
	    return false;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.driver);
	   
	    MapView mapView = (MapView) findViewById(R.id.mapview);
	    mapView.setBuiltInZoomControls(true);
	}
}
