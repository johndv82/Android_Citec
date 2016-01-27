package com.citec.asus.helloworldjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*RelativeLayout rl = new RelativeLayout(this);
        TextView tv = new TextView(this);
        tv.setText("Hola.... desde Java");
        tv.setX(150);
        tv.setY(140);*/
        setContentView(R.layout.activity_main);
    }

    public void mostrarMensajeLogin(View v){
        final TextView texto = (TextView) findViewById(R.id.editText);
        Toast mensaje = Toast.makeText(getApplicationContext(), "Cargando perfil de " + texto.getText(), Toast.LENGTH_SHORT);
        mensaje.show();
        Intent myIntent = new Intent(MainActivity.this, menu.class);
        myIntent.putExtra("nombre", texto.getText());
        MainActivity.this.startActivity(myIntent);
    }
}
