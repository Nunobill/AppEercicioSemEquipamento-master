package com.example.appeerciciosemequipamento;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class Categoria2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void Escolher2(View view) {
        Toast.makeText(this, "Escolher Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Escolher2Activity.class);
        startActivity(intent);
    }

    public void Adicionar2(View view) {
        Toast.makeText(this, "Adicionar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Adicionar2Activity.class);

        startActivity(intent);
    }


    public void Editar2(View view) {
        Toast.makeText(this, "Editar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Editar2Activity.class);
        startActivity(intent);
    }

    public void Eliminar2(View view) {
        Toast.makeText(this, "Eliminar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Eliminar2Activity.class);
        startActivity(intent);
    }
}
