package com.example.p33ej2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] canciones = null;
        int i = 0;
        
        try {
        	// open the file for reading
        	InputStream instream = new FileInputStream("/data/canciones.txt");

        	// if file the available for reading
        	if (instream != null) {
        	  // prepare the file for reading
        	  InputStreamReader inputreader = new InputStreamReader(instream);
        	  BufferedReader buffreader = new BufferedReader(inputreader);

        	  // read every line of the file into the line-variable, on line at the time
        	  do {
        	     canciones[i] = buffreader.readLine();
        	     
        	     i++;
        	    // do something with the line 
        	  } while (canciones[i] != null);

        	}
        	} catch (Exception ex) {
        	    // print stack trace.
        	} finally {
        	// close the file.
        	//instream.close();        	
        	}
        
    }

}
