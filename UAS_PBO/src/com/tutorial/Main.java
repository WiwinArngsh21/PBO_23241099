package com.tutorial;


import java.util.ArrayList;
import java.util.List;

import com.tutorial.pegawaitetap.Pegawai;
import com.tutorial.pegawaitidaktetap.PegawaiTetap;
import com.tutorial.pegawaitidaktetap.PegawaiTidakTetap;

public class Main {
    public static void main(String[] args) {
        List<Pegawai> pegawaiList = new ArrayList<>();

        // Menambahkan pegawai tetap
        pegawaiList.add(new PegawaiTetap("Ali", 5000000));
        pegawaiList.add(new PegawaiTetap("Budi", 6000000));

        // Menambahkan pegawai tidak tetap
        pegawaiList.add(new PegawaiTidakTetap("Cici", 3000000));
        pegawaiList.add(new PegawaiTidakTetap("Dodi", 4000000));

        // Mengatur lembur
        pegawaiList.get(0).setLembur(10, 0.1); // Ali lembur 10 jam
        pegawaiList.get(1).setLembur(5, 0.1);  // Budi lembur 5 jam
        pegawaiList.get(2).setLembur(8, 0.05); // Cici lembur 8 jam
        pegawaiList.get(3).setLembur(12, 0.05); // Dodi lembur 12 jam

        // Menampilkan informasi pegawai
        System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", "Nama", "Gaji Pokok", "Tunjangan", "Durasi Lembur", "Gaji Bersih");
        for (Pegawai pegawai : pegawaiList) {
            String tunjangan = pegawai instanceof PegawaiTetap ? String.valueOf(((PegawaiTetap) pegawai).getTunjangan()) : "0";
            String durasiLembur = String.valueOf(pegawai.getLembur() / (pegawai instanceof PegawaiTetap ? 0.1 * pegawai.getGajiPokok() : 0.05 * pegawai.getGajiPokok()));
            System.out.printf("%-15s %-15s %-15s %-15s %-15s%n", pegawai.getNama(), pegawai.getGajiPokok(), tunjangan, durasiLembur, pegawai.hitungGajiBersih());
        }
    }
}

    

