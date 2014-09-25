package com.example.p2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
 

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
      //Obtenemos una referencia a los controles de la interfaz
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final Button btnHola = (Button)findViewById(R.id.BtnHola);
        
        
      //Implementamos el evento �click� del bot�n
        btnHola.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent =
                          new Intent(MainActivity.this, FrmSaludo.class);
 
                  //Creamos la informaci�n a pasar entre actividades
                  Bundle b = new Bundle();
                  b.putString("NOMBRE", txtNombre.getText().toString());
 
                  //A�adimos la informaci�n al intent
                  intent.putExtras(b);
 
                  //Iniciamos la nueva actividad
                  startActivity(intent);
             }
        });
        
      
    }
}
