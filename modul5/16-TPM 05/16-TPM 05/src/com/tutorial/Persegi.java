package com.tutorial;

public class Persegi extends BangunDatar{
    // Atribut
    private float sisi;

    // Constructor dari subclass
    public Persegi(float sisi){
        this.sisi = sisi;
    }
    //overriding luas 
    public float luas(){
        return sisi*sisi;
    }
    //overriding keliling 
    public float keliling(){
        return 4 * sisi;
    }
}
