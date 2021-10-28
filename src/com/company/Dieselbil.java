package com.company;

public class Dieselbil extends Bil{
    boolean harPartikelFilter;
    int kmPrL;
    double afgift = 0;
    double udligningsafgift = 0;
    double partikeludledningsafgift = 1000;

    public Dieselbil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelFilter, int kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil: " +
                "regNr: " + regNr +
                ", mærke: " + mærke +
                ", model: " + model +
                ", årgang: " + årgang +
                ", antalDøre: " + antalDøre +
                ", harPartikelFilter: " + harPartikelFilter +
                ", kmPrL: " + kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        if(harPartikelFilter == false) {
            afgift = afgift + partikeludledningsafgift;
        }

        if ((kmPrL <= 50) && (kmPrL > 20)) {
            udligningsafgift = 130;
            afgift = afgift + 330;
            afgift = udligningsafgift + afgift;
            return afgift;
        } else if ((kmPrL <= 20) && (kmPrL > 15)) {
            udligningsafgift = 1390;
            afgift = afgift + 1050;
            afgift = udligningsafgift + afgift;
            return afgift;
        } else if ((kmPrL <= 15) && (kmPrL > 10)) {
            udligningsafgift = 1850;
            afgift = afgift + 2340;
            afgift = udligningsafgift + afgift;
            return afgift;
        } else if ((kmPrL <= 10) && (kmPrL > 5)) {
            udligningsafgift = 2770;
            afgift = afgift + 5500;
            afgift = udligningsafgift + afgift;
            return afgift;
        } else if (kmPrL <= 5) {
            udligningsafgift = 15260;
            afgift = afgift + 10470;
            afgift = udligningsafgift + afgift;
            return afgift;
        }
        return afgift;
    }
}
