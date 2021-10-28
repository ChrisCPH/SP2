package com.company;

public class Main {

    public static void main(String[] args) {
        Bil bil1 = new Benzinbil("GW 40 958", "BMW","i7",2017,4,100,10);
        Bil bil2 = new Elbil("TC 53 785", "Mercedes", "EQC", 2021, 4, 80, 370, 216);
        Bil bil3 = new Dieselbil("BT 78 599", "Fiat", "500", 2016, 2, false, 23);
        Garage garage = new Garage("myGarage");
        garage.tilføjBiler(bil1);
        garage.tilføjBiler(bil2);
        garage.tilføjBiler(bil3);
        System.out.println(garage.toString());
        System.out.println(garage.beregnGrønAfgiftForBilpark());
        //System.out.println(bil1.toString());
        //System.out.println(bil2.toString());
        //System.out.println(bil3.toString());
    }
}
