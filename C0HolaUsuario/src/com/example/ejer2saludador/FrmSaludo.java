package com.example.ejer2saludador;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class FrmSaludo extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);
 
        //Localizar los controles
             TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
 
             //Recuperamos la informaci�n pasada en el intent
             Bundle bundle = this.getIntent().getExtras();
 
             //Construimos el mensaje a mostrar
             txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
    }
}