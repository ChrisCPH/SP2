package com.company;

public class Benzinbil extends Bil {
    int oktantal;
    int kmPrL;
    double afgift = 0;
    public Benzinbil(String regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil: " +
                "oktantal: " + oktantal +
                ", kmPrL: " + kmPrL +
                ", regNr: " + regNr +
                ", mærke: " + mærke +
                ", model: " + model +
                ", årgang: " + årgang +
                ", antalDøre: " + antalDøre;
    }

    @Override
    public double beregnGrønEjerafgift() {
        if((kmPrL <= 50 ) && (kmPrL > 20)){
            afgift = 330;
            return afgift;
        } else if((kmPrL <= 20) && (kmPrL > 15)) {
            afgift = 1050;
            return afgift;
        } else if((kmPrL <= 15) && (kmPrL > 10)) {
            afgift = 2340;
            return afgift;
        } else if((kmPrL <= 10) && (kmPrL > 5)) {
            afgift = 5500;
            return afgift;
        } else if(kmPrL <= 5) {
            afgift = 10470;
            return afgift;
        }
        return afgift;
    }
}
