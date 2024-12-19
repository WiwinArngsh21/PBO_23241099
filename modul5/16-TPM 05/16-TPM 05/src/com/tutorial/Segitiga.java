package com.tutorial;

public class Segitiga extends BangunDatar {
    // Atribut
    private float alas;
    private float tinggi;
    private float sisiMiring;
    
    // Constructor dari Subclass
    public Segitiga (float alas, float tinggi,float sisiMiring){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }
    //overriding luas
    public float luas(){
        return (alas * tinggi)/2;
    }
    //overriding keliling
    public float keliling(){
        sisiMiring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }
}
