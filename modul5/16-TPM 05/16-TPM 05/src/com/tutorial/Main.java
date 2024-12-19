package com.tutorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas dan Keliling Bangun Datar");
        // membuat objek 
        // Persegi
        Persegi persegi = new Persegi(2);
        System.out.println("\nPersegi");
        System.out.println("Luas = " + persegi.luas());
        System.out.println("Keliling = " + persegi.keliling());

        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(4);
        System.out.println("\nLingkaran");
        System.out.println("Luas = " + lingkaran.luas());
        System.out.println("Keliling = " + lingkaran.keliling());

        // Persegi Panjang
        PersegiPanjang persegipanjang = new PersegiPanjang(5, 6);
        System.out.println("\nPersegi Panjang");
        System.out.println("Luas = " + persegipanjang.luas());
        System.out.println("Keliling = " + persegipanjang.keliling());


        // Segitiga
        Segitiga segitiga = new Segitiga(12, 2, 3);
        System.out.println("\nSegitiga");
        System.out.println("Luas = " + segitiga.luas());
        System.out.println("Keliling = " + segitiga.keliling());




    }
}
