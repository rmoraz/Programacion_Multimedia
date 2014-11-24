package com.example.p33ej2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

	ArrayList<String> lista = new ArrayList<String>();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = getListView();
 		listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
 		listView.setTextFilterEnabled(true);
        String linea;
        int i = 0;
        
        try {
        	InputStream instream = new FileInputStream("/data/canciones.txt");
        	// open the file for reading

        	// if file the available for reading
        	if (instream != null) {
        	  // prepare the file for reading
        	  InputStreamReader inputreader = new InputStreamReader(instream);
        	  BufferedReader buffreader = new BufferedReader(inputreader);

        	  // read every line of the file into the line-variable, on line at the time
        	  while((linea = buffreader.readLine()) != null){
        	     lista.add(linea); 
        	    // do something with the line 
        	  };
        	}
        	} catch (Exception ex) {
        	    // print stack trace.
        	} 
        
 		
        setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, android.R.id.text1, lista));
  
 		// Assign adapter to ListView
		//listView.setAdapter(adapter);
        
    }
    
    public void onListItemClick(
    	    ListView parent, View v, int position, long id)
    	    {
    	        Toast.makeText(this,
    	            "Has seleccionado " + lista.get(position),
    	            Toast.LENGTH_SHORT).show();
    	    }
    	    
    	    public void onClick(View view) {
    	    	ListView listView = getListView();
    	    	
    	    	String itemsSelected = "Canciones seleccionadas: \n";
    	    	for (int i=0; i<listView.getCount(); i++) {
    	    		if (listView.isItemChecked(i)) {
    	    			itemsSelected += listView.getItemAtPosition(i) + "\n";
    	    		}
    	    	}
    	    	Toast.makeText(this, itemsSelected, Toast.LENGTH_LONG).show();
    	    }

}
