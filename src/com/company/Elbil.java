package com.company;

public class Elbil extends Bil {
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;
    double kmPrL = 100 / (whPrKm / 91.25);
    double afgift = 0;

    public Elbil(String regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm){
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil: " +
                "regNr: " + regNr +
                ", mærke: " + mærke +
                ", model: " + model +
                ", årgang: " + årgang +
                ", antalDøre: " + antalDøre +
                ", batterikapacitetKWh: " + batterikapacitetKWh +
                ", maxKm: " + maxKm +
                ", whPrKm: " + whPrKm;
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
