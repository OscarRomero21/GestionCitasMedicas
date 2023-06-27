package com.example.citasmedicas;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button  btnRegistrar;
    private Button btnIngress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_registrar = new Intent(MainActivity.this, RegistraUser.class );
                startActivity(intent_registrar);
            }
        });

        btnIngress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ingress = new Intent(MainActivity.this, Acciones.class );
                startActivity(intent_ingress);
            }
        });

    }
  private void initialize() {
      btnRegistrar =  findViewById(R.id.btnRegistrar);
      btnIngress =  findViewById(R.id.btnIngress);
  }
}

