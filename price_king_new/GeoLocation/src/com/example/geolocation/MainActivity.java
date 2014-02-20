package com.example.geolocation;

import com.example.geolocation.*;


import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LocationManager mlocManager =

        		(LocationManager)getSystemService(Context.LOCATION_SERVICE);

        		LocationListener mlocListener = new MyLocationListener();


        		mlocManager.requestLocationUpdates( LocationManager.GPS_PROVIDER, 0, 0, (android.location.LocationListener) mlocListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public class MyLocationListener extends LocationListener {
		public void onLocationChanged(Location loc)
	    {
	    	loc.getLatitude();
	    	loc.getLongitude();

	    	String Text ="My current location is: " + "Latitud = " + loc.getLatitude() + "Longitud = " + loc.getLongitude();
	    	Toast.makeText( getApplicationContext(),Text,Toast.LENGTH_SHORT).show();
	    }


	    public void onProviderDisabled(String provider)
	    {
	    	Toast.makeText( getApplicationContext(), "Gps Disabled",Toast.LENGTH_SHORT ).show();
	    }


	    public void onProviderEnabled(String provider)
	    {
	    	Toast.makeText( getApplicationContext(),"Gps Enabled",Toast.LENGTH_SHORT).show();
	    }
	    public void onStatusChanged(String provider, int status, Bundle extras)
	    {

	    }

	    /* End of Class MyLocationListener */

	}


}
