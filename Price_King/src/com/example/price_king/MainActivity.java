package com.example.price_king;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//changes by Kibrom with other changes 
// I have added some changed,zenkig
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //...other changes I made

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
