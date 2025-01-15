package com.tutorial;

public class pegawaitetap {
    class Pegawai {
        protected String nama;
        protected double gajiPokok;
        protected double lembur;
    
        public Pegawai(String nama, double gajiPokok) {
            this.nama = nama;
            this.gajiPokok = gajiPokok;
            this.lembur = 0; // default lembur
        }
    
        public double hitungGajiBersih() {
            return gajiPokok + lembur;
        }
    
        public void setLembur(double durasi, double persen) {
            this.lembur = durasi * (persen * gajiPokok);
        }
    
        public String getNama() {
            return nama;
        }
    
        public double getGajiPokok() {
            return gajiPokok;
        }
    
        public double getLembur() {
            return lembur;
        }
    }
    
}
