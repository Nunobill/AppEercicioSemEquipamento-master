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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }




    public void Abdomen(View view) {
        Toast.makeText(this, "Carregar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, CategoriaActivity.class);
        startActivity(intent);
    }


    public void Pernas(View view) {
        Toast.makeText(this, "Carregar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Categoria1Activity.class);
        startActivity(intent);
    }


    public void Corpo(View view) {
        Toast.makeText(this, "Carregar Categorias...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Categoria2Activity.class);
        startActivity(intent);
    }
}
