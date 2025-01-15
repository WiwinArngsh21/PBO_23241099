package com.tutorial;

import com.tutorial.pegawaitetap.Pegawai;

public class pegawaitidaktetap {
    class PegawaiTetap extends Pegawai {
    private double tunjangan;

    public PegawaiTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0.7 * gajiPokok; // 70% dari gaji pokok
    }

    @Override
    public double hitungGajiBersih() {
        return gajiPokok + tunjangan + lembur;
    }

    public double getTunjangan() {
        return tunjangan;
    }
}

class PegawaiTidakTetap extends Pegawai {
    public PegawaiTidakTetap(String nama, double gajiPokok) {
        super(nama, gajiPokok);
    }

    @Override
    public double hitungGajiBersih() {
        return gajiPokok + lembur;
    }
 }
}
