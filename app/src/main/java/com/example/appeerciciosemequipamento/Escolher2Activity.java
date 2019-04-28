package com.example.appeerciciosemequipamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Escolher2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher2);
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

        TextView textViewEscolherC1Corp = (TextView) findViewById(R.id.textViewEscolherC1);

        TextView textViewEscolherC2Corp = (TextView) findViewById(R.id.textViewEscolherC2);

        textViewEscolherC1Corp.setText(nome);
        textViewEscolherC2Corp.setText(duracao);

        textViewEscolherC1Corp.setText(nome1);
        textViewEscolherC2Corp.setText(duracao1);

    }

    public void cancelarCorp(View view) {
        finish();
    }
}
