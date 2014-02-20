package com.example.mygeolocation;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txtLat;
	TextView txtLong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*Author :Soumya
		 * To locate Lattitude and Longitude of the User
		 */
		
		txtLat= (TextView)findViewById(R.id.textLat);
		txtLong=(TextView)findViewById(R.id.textLong);
		
		LocationManager lm=(LocationManager)getSystemService(Context.LOCATION_SERVICE);
		LocationListener ll=new myLocationListener();
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, ll);
	}
		class myLocationListener implements LocationListener{

			@Override
			public void onLocationChanged(Location location) {
				if (location != null)
				{
					double pLat=location.getLatitude();
					double pLong=location.getLongitude();
					
					txtLat.setText(Double.toString(pLat));
					txtLong.setText(Double.toString(pLong));
					
					
				}
				
			}

			@Override
			public void onProviderDisabled(String provider) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onProviderEnabled(String provider) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStatusChanged(String provider, int status,
					Bundle extras) {
				// TODO Auto-generated method stub
				
			}
		
		}
		
	//}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
