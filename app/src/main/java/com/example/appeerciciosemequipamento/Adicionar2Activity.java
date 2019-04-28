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

public class Adicionar2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Adicionar2Corp(View view) {
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();

        if (nome.trim().length() == 0) {
            editTextNome.setError("Campo Obrigatório");
            editTextNome.requestFocus();
            return;
        }


        EditText editTextDuracao = (EditText) findViewById(R.id.editTextDuracao);
        String duracao = editTextDuracao.getText().toString();

        if (duracao.trim().length() == 0) {
            editTextDuracao.setError("Campo Obrigatório");
            editTextDuracao.requestFocus();
            return;
        }

        Toast.makeText(this, "Carregarando...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Escolher2Activity.class);
        intent.putExtra(DefinicoesApp.NOME, nome);
        intent.putExtra(DefinicoesApp.DURACAO, duracao);


        startActivity(intent);
    }

    public void cancelarAddCorp(View view) {
        finish();
    }
}
