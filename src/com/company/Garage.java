package com.company;

import java.util.ArrayList;

public class Garage {
    String name;
    ArrayList<Bil> biler = new ArrayList<>();

    public Garage(String name){
        this.name = name;
    }

    public void tilføjBiler(Bil bil){
        if(!biler.contains(bil)){
            biler.add(bil);
        }
    }
    @Override
    public String toString() {
        return "Garage biler: " + biler;
    }
    public double beregnGrønAfgiftForBilpark(){
        double afgift = 0;
        double tmpafgift = 0;
        Bil bil = null;
        for(int i = 0; i < biler.size(); i++){
            bil = biler.get(i);
            tmpafgift = bil.beregnGrønEjerafgift();
            afgift = afgift + tmpafgift;
        }
        return afgift;
    }
}
