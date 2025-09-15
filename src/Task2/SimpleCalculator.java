package Task2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Hitung hasil operasi matematika
        double hasilPenjumlahan = angka1 + angka2;
        double hasilPengurangan = angka1 - angka2;
        double hasilPerkalian   = angka1 * angka2;

        // Cek pembagian dengan nol
        String hasilPembagian;
        if (angka2 != 0) {
            hasilPembagian = String.valueOf(angka1 / angka2);
        } else {
            hasilPembagian = "Tidak bisa dibagi 0";
        }

        // Cek modulus dengan nol
        String hasilModulus;
        if (angka2 != 0) {
            hasilModulus = String.valueOf(angka1 % angka2);
        } else {
            hasilModulus = "Tidak bisa modulus dengan 0";
        }

        // Tampilkan hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println(angka1 + " + " + angka2 + " = " + hasilPenjumlahan);
        System.out.println(angka1 + " - " + angka2 + " = " + hasilPengurangan);
        System.out.println(angka1 + " * " + angka2 + " = " + hasilPerkalian);
        System.out.println(angka1 + " / " + angka2 + " = " + hasilPembagian);
        System.out.println(angka1 + " % " + angka2 + " = " + hasilModulus);

        scanner.close();
    }
}
