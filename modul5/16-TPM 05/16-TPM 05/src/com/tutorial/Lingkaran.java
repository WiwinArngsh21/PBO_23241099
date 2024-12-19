package com.tutorial;

public class Lingkaran extends BangunDatar{
    // Atribut
    private float r;

    // Constructor dari Subclass
    public Lingkaran(float r){
        this.r = r;
    }

    //overriding luas
    public float luas(){
        return 3.14f * r * r;
    }

    //overriding keliling
    public float keliling(){
        return 2 * 3.14f * r;
    }
    
}
