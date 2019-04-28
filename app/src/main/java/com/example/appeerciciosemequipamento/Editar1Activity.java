package com.example.appeerciciosemequipamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Editar1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void CancelarEditPern(View view) {
        finish();
    }



    public void Escolher1(View view) {
        EditText editTextNome1 = (EditText) findViewById(R.id.editTextViewNome1);
        String nome1 = editTextNome1.getText().toString();

        if (nome1.trim().length() == 0) {
            editTextNome1.setError("Campo Obrigatório");
            editTextNome1.requestFocus();
            return;
        }


        EditText editTextDuracao1 = (EditText) findViewById(R.id.editTextViewDuracao1);
        String duracao1 = editTextDuracao1.getText().toString();

        if (duracao1.trim().length() == 0) {
            editTextDuracao1.setError("Campo Obrigatório");
            editTextDuracao1.requestFocus();
            return;
        }

        Toast.makeText(this, "Carregarando Alterações...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Escolher1Activity.class);
        intent.putExtra(DefinicoesApp.NOME, nome1);
        intent.putExtra(DefinicoesApp.DURACAO, duracao1);


        startActivity(intent);
    }
}
