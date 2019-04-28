package com.example.appeerciciosemequipamento;

public class CatCorpoInt {
    int id_corpo;
    String Categoria_corpo;


    public CatCorpoInt (int id_abdomen, String Categoria_Ab ){
        this.id_corpo = id_corpo ;
        this.Categoria_corpo= Categoria_corpo;
    }


    //Setters and getters
    public int getId_corpo() {
        return id_corpo;
    }

    public void setId_corpo(int id_corpo) {
        this.id_corpo = id_corpo;
    }

    public String getCategoria_corpo() {
        return Categoria_corpo;
    }

    public void setCategoria_corpo(String categoria_corpo) {
        Categoria_corpo = categoria_corpo;
    }
}
