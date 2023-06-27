package com.example.citasmedicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegistraUser extends AppCompatActivity {

    private EditText txtName;
    private EditText intCedula;
    private EditText intCelular;
    private EditText txtEmail;
    private EditText txtLugar;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra_user);
        initialize();
    }
    private void initialize() {
        txtName = (EditText) findViewById(R.id.txtName);
        intCedula = (EditText) findViewById(R.id.intCedula);
        intCelular = (EditText) findViewById(R.id.intCelular);
        txtEmail = (EditText) findViewById(R.id.txtEmail);
        txtLugar = (EditText) findViewById(R.id.txtLugar);
        btnRegister = (Button) findViewById(R.id.btnRegister);
    }
}