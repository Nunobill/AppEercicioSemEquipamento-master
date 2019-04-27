package com.example.appeerciciosemequipamento;

public class CatAbdomen {
    int id_abdomen;
    String Categoria_Ab;



    public CatAbdomen (int id_abdomen, String Categoria_Ab ){
        this.id_abdomen = id_abdomen ;
        this.Categoria_Ab= Categoria_Ab;
    }

    //Setters and getters
    public int getId_abdomen() {
        return id_abdomen;
    }

    public void setId_abdomen(int id_abdomen) {
        this.id_abdomen = id_abdomen;
    }

    public String getCategoria_Ab() {
        return Categoria_Ab;
    }

    public void setCategoria_Ab(String categoria_Ab) {
        Categoria_Ab = categoria_Ab;
    }
}
