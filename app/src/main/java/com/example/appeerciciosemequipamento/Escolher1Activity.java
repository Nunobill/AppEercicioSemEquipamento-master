package com.example.appeerciciosemequipamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Escolher1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void escolheractivity(){

        Intent intent = getIntent();

        String nome = intent.getStringExtra(DefinicoesApp.NOME);
        String duracao = intent.getStringExtra(DefinicoesApp.DURACAO);

        String nome1 = intent.getStringExtra(DefinicoesApp.NOME);
        String duracao1 = intent.getStringExtra(DefinicoesApp.DURACAO);

        TextView textViewEscolherC1Pern = (TextView) findViewById(R.id.textViewEscolherC1);

        TextView textViewEscolherC2Pern = (TextView) findViewById(R.id.textViewEscolherC2);

        textViewEscolherC1Pern.setText(nome);
        textViewEscolherC2Pern.setText(duracao);

        textViewEscolherC1Pern.setText(nome1);
        textViewEscolherC2Pern.setText(duracao1);

    }

    public void cancelarPern(View view) {
        finish();
    }
}
