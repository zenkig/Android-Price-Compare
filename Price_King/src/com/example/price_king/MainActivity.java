
package com.example.price_king;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

// Project Price King, first page. 
// P. 1st 2014.02.18th
public class MainActivity extends Activity {

    public final static String EXTRA_MESSAGE = "com.example.price_king.MESSAGE";

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
    
    /** Called when the user clicks the Search button */
    /* 
     *  public void sendMessage(View view) {
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        
    }
    */
    
    /** Called when the user clicks the Location button, on left of the MainActivity page */
    public void showLocation(View view) {
   // Do something in response to button
      }

    
}

