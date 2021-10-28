package com.company;

abstract public class Bil {
    String regNr;
    String mærke;
    String model;
    int årgang;
    int antalDøre;
    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    abstract public double beregnGrønEjerafgift();
}
