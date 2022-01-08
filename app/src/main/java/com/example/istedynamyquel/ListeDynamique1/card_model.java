package com.example.istedynamyquel.ListeDynamique1;

public class card_model {
    public card_model(String nom, String permisRequis ,String description,  int publication) {
        this.nom = nom;
        this. permisRequis =  permisRequis;
        this.description = description;
        this.publication = publication;
    }

    private String nom,permisRequis,description;
    private int publication ;

    public String getNom() {
        return nom;
    }

     public String getPermisRequis() {
        return  permisRequis;
    }


    public String getDescription() {
        return description;
    }

    public int getPublication() {
        return publication;
    }
}

