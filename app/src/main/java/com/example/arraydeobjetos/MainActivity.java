package com.example.arraydeobjetos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nome, sobrenome;
    Button btAdicionar, btProxima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.editTextNome);
        sobrenome = findViewById(R.id.editTextSobrenome);
        btAdicionar = findViewById(R.id.buttonAdicionar);
        btProxima = findViewById(R.id.buttonProxima);

        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nome.setText("");
                sobrenome.setText("");
                nome.requestFocus();
            }
        });

        btProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criação da Intent
                Intent it = new Intent(getApplicationContext(), Resultado.class);

                // colocando o ArrayList com os objetos Pessoa na Intent
                //it.putExtra("pessoas", listaPessoas);

                // envia o objeto
                startActivity(it);
            }
        });
    }
}