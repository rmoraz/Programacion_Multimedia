package com.example.p2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FrmSaludo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        
      //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);

        //Recuperamos la informaci�n pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
        
        
        final Button btnAtras = (Button)findViewById(R.id.BtnAtras);
        
      //Implementamos el evento �click� del bot�n
        btnAtras.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent
                  Intent intent =
                          new Intent(FrmSaludo.this, MainActivity.class);
 
                  //Creamos la informaci�n a pasar entre actividades
                  //Bundle b = new Bundle();
                  //b.putString("NOMBRE", txtNombre.getText().toString());
 
                  //A�adimos la informaci�n al intent
                  //intent.putExtras(b);
 
                  //Iniciamos la nueva actividad
                  startActivity(intent);
             }
        });
       }
}