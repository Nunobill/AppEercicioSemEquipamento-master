package com.example.appeerciciosemequipamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class EscolherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        escolheractivity();
    }


    private void escolheractivity(){

        Intent intent = getIntent();

        String nome = intent.getStringExtra(DefinicoesApp.NOME);
        String duracao = intent.getStringExtra(DefinicoesApp.DURACAO);

        String nome1 = intent.getStringExtra(DefinicoesApp.NOME);
        String duracao1 = intent.getStringExtra(DefinicoesApp.DURACAO);

        TextView textViewEscolherC1 = (TextView) findViewById(R.id.textViewEscolherC1);

        TextView textViewEscolherC2 = (TextView) findViewById(R.id.textViewEscolherC2);

        textViewEscolherC1.setText(nome);
        textViewEscolherC2.setText(duracao);

        textViewEscolherC1.setText(nome1);
        textViewEscolherC2.setText(duracao1);

    }

    public void cancelar1(View view) {
        finish();
    }
}
