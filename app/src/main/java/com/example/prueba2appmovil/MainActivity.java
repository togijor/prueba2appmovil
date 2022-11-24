package com.example.prueba2appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout tiltarea, tildescripcion;
    private Button btningresar, btnmodificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        accionesusuarios();
        eventobotones();
    }


    private void accionesusuarios(){
        tiltarea = findViewById(R.id.tilTitulo);
        tildescripcion = findViewById(R.id.tilDescripcion);
        btningresar = findViewById(R.id.btnIngresar);
        btnmodificar = findViewById(R.id.btnModificar);

    }

    private void obtenerdatos (){
        String nombretarea, descripciontarea;
        nombretarea = tiltarea.getEditText().toString();
        descripciontarea = tildescripcion.getEditText().toString();

    }

    private void eventobotones (){
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obtenerdatos();
            }
        });




    }




}