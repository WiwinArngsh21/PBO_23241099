import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean lanjutkan = true;

    while (lanjutkan) {
      System.out.println("\n Program Kalkulator");
      System.out.println("----------------------\n");
      System.out.println("Silahkan pilih menu berikut:");
      System.out.println("1. Perkalian");
      System.out.println("2. Pembagian");
      System.out.println("3. Penjumlahan");
      System.out.println("4. Pengurangan");

      System.out.print("Pilihan anda: ");
      int pilihan = scanner.nextInt();

      System.out.print("Masukkan bilangan 1: ");
      double bilangan1 = scanner.nextDouble();

      System.out.print("Masukkan bilangan 2: ");
      double bilangan2 = scanner.nextDouble();

      double hasil = 0;

      switch (pilihan) {
        case 1:
          hasil = bilangan1 * bilangan2;
          break;
        case 2:
          hasil = bilangan1 / bilangan2;
          break;
        case 3:
          hasil = bilangan1 + bilangan2;
          break;
        case 4:
          hasil = bilangan1 - bilangan2;
          break;
        default:
          System.out.println("Operasi yang dipilih tidak tersedia, silahkan pilih operasi yang tersedia pada menu berikut!!!");
          continue;
      }

      System.out.println("Hasil: " + hasil);

      System.out.print("Apakah ingin melanjutkan? (ya/tidak): ");
      String jawaban = scanner.next();

      if (jawaban.equalsIgnoreCase("tidak")) {
        lanjutkan = false;
      }
    }

    System.out.println("Terimakasih!!!");
  }
}