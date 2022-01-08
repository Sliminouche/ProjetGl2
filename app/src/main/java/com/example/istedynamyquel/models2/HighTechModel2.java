package com.example.istedynamyquel.models2;

public class HighTechModel2 {
    private String name_user;
    private String prenom_user;
    private String numero_user;
    private String mnemonic2;

    public HighTechModel2(String name_user,String prenom_user,String numero_user, String mnemonic2) {
        this.name_user = name_user;
        this.prenom_user = prenom_user;
        this.numero_user = numero_user;
        this.mnemonic2=mnemonic2;
    }



    public String getName_user() {
        return name_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public String getNumero_user() {
        return numero_user;
    }

    public String getMnemonic2() {
        return mnemonic2;
    }



}