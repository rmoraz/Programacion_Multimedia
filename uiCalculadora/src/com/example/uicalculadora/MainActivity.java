package com.example.uicalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener{

	EditText pantalla,resultado;
	Button Uno,Dos,Tres,Cuatro,Cinco,Seis,Siete,Ocho,Nueve,Cero;
	Button Sumar,Restar,Multiplicar,Dividir,Backspace,Borrar,Igual;
	String operando , operacion, tpOper;
	float valor1, valor2;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pantalla = (EditText)findViewById(R.id.pantalla);
        pantalla.setText("");
        resultado = (EditText)findViewById(R.id.resultado);
        resultado.setText("");
        //pantalla.setOnClickListener(miListener);
        Uno = (Button)findViewById(R.id.Uno);
        Uno.setOnClickListener(this);
        Dos = (Button)findViewById(R.id.Dos);
        Dos.setOnClickListener(this);
        Tres = (Button)findViewById(R.id.Tres);
        Tres.setOnClickListener(this);
        Cuatro = (Button)findViewById(R.id.Cuatro);
        Cuatro.setOnClickListener(this);
        Cinco = (Button)findViewById(R.id.Cinco);
        Cinco.setOnClickListener(this);
        Seis = (Button)findViewById(R.id.Seis);
        Seis.setOnClickListener(this);
        Siete = (Button)findViewById(R.id.Siete);
        Siete.setOnClickListener(this);
        Ocho = (Button)findViewById(R.id.Ocho);
        Ocho.setOnClickListener(this);
        Nueve = (Button)findViewById(R.id.Nueve);
        Nueve.setOnClickListener(this);
        Cero = (Button)findViewById(R.id.Cero);
        Cero.setOnClickListener(this);
        Sumar = (Button)findViewById(R.id.Sumar);
        Sumar.setOnClickListener(this);
        Restar = (Button)findViewById(R.id.Restar);
        Restar.setOnClickListener(this);
        Multiplicar = (Button)findViewById(R.id.Multiplicar);
        Multiplicar.setOnClickListener(this);
        Dividir = (Button)findViewById(R.id.Dividir);
        Dividir.setOnClickListener(this);
        Backspace = (Button)findViewById(R.id.Backspace);
        Backspace.setOnClickListener(this);
        Borrar = (Button)findViewById(R.id.Borrar);
        Borrar.setOnClickListener(this);
        Igual = (Button)findViewById(R.id.Igual);
        Igual.setOnClickListener(this);
        
    }


	public void onClick(View v) {
		if (resultado.getText().length()>0){
			operando = resultado.getText().toString();
		}
		else {
			resultado.setText("");
			operando ="";
		}
		if (pantalla.getText().length()>0){
			operacion = pantalla.getText().toString();
		}
		else {
			pantalla.setText("");
			operacion = "";
		}
		
		
		switch (v.getId()){
		case (R.id.Uno): 
			operacion = operacion + "1";
			operando = operando + "1";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Dos): 
			operando = operando + "2";
			operacion = operacion + "2";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Tres): 
			operacion = operacion + "3";
			operando = operando + "3";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Cuatro): 
			operacion = operacion + "4";
			operando = operando + "4";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Cinco): 
			operacion = operacion + "5";
			operando = operando + "5";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Seis): 
			operacion = operacion + "6";
			operando = operando + "6";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Siete): 
			operacion = operacion + "7";
			operando = operando + "7";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Ocho): 
			operacion = operacion + "8";
			operando = operando + "8";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Nueve): 
			operacion = operacion + "9";
			operando = operando + "9";
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Cero): 
			//if (operando.length()>0){
				operacion = operacion + "0";
				operando = operando + "0";
				resultado.setText(operando);
				pantalla.setText(operacion);
			
			break;
		case (R.id.Igual): 
			valor2 = Float.valueOf(resultado.getText().toString());
			if (tpOper=="+"){
				valor1 = valor1 + valor2;
			}
			else if (tpOper=="-"){
				valor1 = valor1 - valor2;
			}
			else if (tpOper=="*"){
				valor1 = valor1 * valor2;
			}
			else if (tpOper=="/"){
				valor1 = valor1 / valor2;
			}
			operacion = operacion + "=";
			resultado.setText(Float.toString(valor1));
			break;
		case (R.id.Sumar): 
			tpOper="+";
			valor1 = Float.valueOf(resultado.getText().toString());
			operacion = operacion + "+";
			operando="";
			resultado.setText("");
			pantalla.setText(operacion);
			break;
		case (R.id.Restar):
			tpOper="-";
			valor1 = Float.valueOf(resultado.getText().toString());
			operacion = operacion + "-";
			operando="";
			resultado.setText("");
			pantalla.setText(operacion);
			break;
		case (R.id.Multiplicar):
			tpOper="*";
			valor1 = Float.valueOf(resultado.getText().toString());
			operacion = operacion + "*";
			operando="";
			resultado.setText("");
			pantalla.setText(operacion);
			break;
		case (R.id.Dividir):
			tpOper="/";
			valor1 = Float.valueOf(resultado.getText().toString());
			operacion = operacion + "/";
			operando="";
			resultado.setText("");
			pantalla.setText(operacion);
			break;
		case (R.id.Backspace):
			operando = operando.substring(0, operando.length()-1);
			operacion = operacion .substring(0, operacion.length()-1);
			resultado.setText(operando);
			pantalla.setText(operacion);
			break;
		case (R.id.Borrar): 
			resultado.setText("");
			pantalla.setText("");
			break;
		default: break;
		}
		
		
		
	}

}
