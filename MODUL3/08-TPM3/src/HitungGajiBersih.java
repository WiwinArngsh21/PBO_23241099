public class HitungGajiBersih {
    // Atribut
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gaji pokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter untuk pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk pajak (dalam rupiah)
    public double getPajak() {
        return (gajiPokok + tunjangan) * (pajak / 100);
    }

    // Metode untuk menghitung gaji bersih
    public double hitungGajiBersih() {
        return (gajiPokok + tunjangan) - getPajak();
    }

    // Metode untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        System.out.printf("Gaji Bersih Anda adalah sebesar Rp. %.2f\n", hitungGajiBersih());
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        HitungGajiBersih hitung = new HitungGajiBersih();

        // Set data
        hitung.setGajiPokok(3000000); // Contoh gaji pokok
        hitung.setTunjangan(500000); // Contoh tunjangan
        hitung.setPajak(20); // Contoh pajak dalam persen

        // Cetak gaji bersih
        hitung.cetakGajiBersih();
    }
}