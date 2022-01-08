package com.example.istedynamyquel.models;

public class HighTechModel {

    public HighTechModel(String name, String mnemonic) {
        this.name = name;
        this.mnemonic=mnemonic;
    }

    public String getName() {
        return name;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    private String name;
    private String mnemonic;

}
