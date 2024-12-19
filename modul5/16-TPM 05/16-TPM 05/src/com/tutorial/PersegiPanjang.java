package com.tutorial;

public class PersegiPanjang extends BangunDatar {
    // Atribut
    private float panjang;
    private float lebar;

    // Constructor dari Subclass
    public PersegiPanjang (float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //overriding luas
    public float luas(){
        return panjang * lebar;
    }
    //overriding keliling
    public float keliling(){
        return  2 * (panjang + lebar);
    }
}
