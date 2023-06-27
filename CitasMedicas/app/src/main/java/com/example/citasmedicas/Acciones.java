package com.example.citasmedicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Acciones extends AppCompatActivity {

    private Button btnConsultUser;
    private Button btnProgramCita;
    private Button btnConsultCita;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acciones);
        initialize();

        btnConsultUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_registrar = new Intent(Acciones.this, InfoUser.class );
                startActivity(intent_registrar);
            }
        });

        btnProgramCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ingress = new Intent(Acciones.this, AgendarCita.class );
                startActivity(intent_ingress);
            }
        });

        btnConsultCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ingress = new Intent(Acciones.this, InfoCita.class );
                startActivity(intent_ingress);
            }
        });
    }

    private void initialize() {
        btnConsultUser =  findViewById(R.id.btnConsultUser);
        btnProgramCita =  findViewById(R.id.btnProgramCita);
        btnConsultCita =  findViewById(R.id.btnConsultCita);

    }
}