package com.example.istedynamyquel.ListeAdminReservations;

public class represente {
    private String nom_de_loca;
    private String date_rese;
    private String date_fin_rese;
    private String nom_loca;
    private String prenom_loca;
    private String photoloca;

    public String getPhotoloca() {
        return photoloca;
    }

    public represente(String nom_de_loca,String nom_loca,String prenom_loca,String date_rese,String date_fin_rese, String photoloca) {
        this.nom_de_loca = nom_de_loca;
        this.nom_de_loca=nom_de_loca;
        this.prenom_loca=prenom_loca;
        this.date_rese = date_rese;
        this.date_fin_rese=date_fin_rese;
        this.photoloca=photoloca;
    }

    public String getDate_fin_rese() {
        return date_fin_rese;
    }

    public String getNom_loca() {
        return nom_loca;
    }

    public String getPrenom_loca() {
        return prenom_loca;
    }

    public String getNom_de_loca()  {
        return nom_de_loca;
    }

    public String getDate_rese() {
        return date_rese;
    }
}
