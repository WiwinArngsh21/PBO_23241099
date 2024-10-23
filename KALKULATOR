import java.util.Scanner;

class Kalkulator {
    // Membuat atribut untuk objek
    public int pilihan;
    public double bilanganPertama;
    public double bilanganKedua;
    public double hasil;

    // Constructor
    public Kalkulator(double inputBilanganPertama, double inputBilanganKedua) {
        bilanganPertama = inputBilanganPertama;
        bilanganKedua = inputBilanganKedua;
        // inisialisasi variabel hasil
        hasil = 0; 
    }

    // Metode untuk operasi perkalian
    public void perkalian() {
        hasil = bilanganPertama * bilanganKedua;
        System.out.println("Hasil dari " + bilanganPertama + " x " + bilanganKedua + " = " + hasil);
    }

    // Metode untuk operasi pembagian
    public void pembagian() {
        if (bilanganKedua != 0) {
            hasil = bilanganPertama / bilanganKedua;
            System.out.println("Hasil dari " + bilanganPertama + " / " + bilanganKedua + " = " + hasil);
        } else {
            System.out.println("Error: Tidak bisa membagi dengan nol.");
        }
    }

    // Metode untuk operasi penjumlahan
    public void penjumlahan() {
        hasil = bilanganPertama + bilanganKedua;
        System.out.println("Hasil dari " + bilanganPertama + " + " + bilanganKedua + " = " + hasil);
    }

    // Metode untuk operasi pengurangan
    public void pengurangan() {
        hasil = bilanganPertama - bilanganKedua;
        System.out.println("Hasil dari " + bilanganPertama + " - " + bilanganKedua + " = " + hasil);
    }
}

public class TPM1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            // Menampilkan pilihan operasi
            System.out.println("Pilih operasi:");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");

            // Input pilihan operasi
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();

            // Validasi pilihan
            if (pilihan < 1 || pilihan > 4) {
                System.out.println("Error: Pilihan tidak valid. Silakan pilih antara 1 hingga 4.");
            } else {

            // Input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            double bilanganPertama = input.nextDouble();

            // Input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            double bilanganKedua = input.nextDouble();

            // Membuat objek Kalkulator
            Kalkulator kalkulator = new Kalkulator(bilanganPertama, bilanganKedua);

            // Memilih operasi berdasarkan input pengguna
            switch (pilihan) {
                    case 1 -> kalkulator.perkalian();
                    case 2 -> kalkulator.pembagian();
                    case 3 -> kalkulator.penjumlahan();
                    case 4 -> kalkulator.pengurangan();
                }
            }

            // Menanyakan apakah ingin mengulang
            System.out.print("Apakah ingin mengulang? (y/n): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Program selesai.");
        input.close();
    }
}
