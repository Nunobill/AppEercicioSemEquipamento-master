package com.example.appeerciciosemequipamento;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.appeerciciosemequipamento.R.id.editTextNome;

public class CategoriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




    }

    public void recuar(View view) {

        finish();
    }

    public void avancar(View view) {

        @SuppressLint("WrongViewCast")
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String mensagem = editTextNome.getText().toString();

        if (mensagem.trim().length() == 0) {
            editTextNome.setError(getString(R.string.mensagem_obrigatoria));
            editTextNome.requestFocus();
            return;
        }

        Intent intent = new Intent(this, ExercicioActivity.class);

        intent.putExtra(DefinicoesApp.MENSAGEM, mensagem);

        startActivity(intent);




    }


}
