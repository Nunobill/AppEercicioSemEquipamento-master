package com.example.appeerciciosemequipamento;

public class CatPernas {
    int id_pernas;
    String Categoria_pernas;



    public CatPernas (int id_abdomen, String Categoria_Ab ){
        this.id_pernas = id_pernas ;
        this.Categoria_pernas= Categoria_pernas;
    }



    //Setters and getters
    public int getId_pernas() {
        return id_pernas;
    }

    public void setId_pernas(int id_pernas) {
        this.id_pernas = id_pernas;
    }

    public String getCategoria_pernas() {
        return Categoria_pernas;
    }

    public void setCategoria_pernas(String categoria_pernas) {
        Categoria_pernas = categoria_pernas;
    }
}
