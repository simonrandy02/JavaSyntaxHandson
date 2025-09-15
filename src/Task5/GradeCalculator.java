package Task5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM PERHITUNGAN NILAI ===");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Mata Kuliah: ");
        String mataKuliah = scanner.nextLine();

        // Input komponen nilai dengan validasi
        double nilaiTugas = inputNilai(scanner, "Nilai Tugas (0-100): ");
        double nilaiUTS = inputNilai(scanner, "Nilai UTS (0-100): ");
        double nilaiUAS = inputNilai(scanner, "Nilai UAS (0-100): ");

        // Hitung nilai akhir
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

        // Tentukan grade huruf dan keterangan
        char gradeHuruf;
        String keterangan;

        if (nilaiAkhir >= 85) {
            gradeHuruf = 'A';
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
            keterangan = "Kurang";
        } else {
            gradeHuruf = 'E';
            keterangan = "Gagal";
        }

        // Konversi ke skala 4.0
        double skala4 = konversiKeSkala4(nilaiAkhir);

        // Status kelulusan
        String statusKelulusan = (nilaiAkhir >= 60) ? "Lulus" : "Tidak Lulus";

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Mahasiswa     : " + nama);
        System.out.println("Mata Kuliah   : " + mataKuliah);
        System.out.println("Nilai Tugas   : " + nilaiTugas);
        System.out.println("Nilai UTS     : " + nilaiUTS);
        System.out.println("Nilai UAS     : " + nilaiUAS);
        System.out.println("Nilai Akhir   : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade         : " + gradeHuruf);
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("Skala 4.0     : " + String.format("%.2f", skala4));
        System.out.println("Status        : " + statusKelulusan);

        scanner.close();
    }

    // Fungsi untuk validasi input nilai
    public static double inputNilai(Scanner scanner, String prompt) {
        double nilai;
        do {
            System.out.print(prompt);
            nilai = scanner.nextDouble();
            if (nilai < 0 || nilai > 100) {
                System.out.println(" Nilai harus antara 0 hingga 100. Silakan input ulang.");
            }
        } while (nilai < 0 || nilai > 100);
        return nilai;
    }

    // Fungsi untuk konversi nilai ke skala 4.0
    public static double konversiKeSkala4(double nilai) {
        if (nilai >= 85) {
            return 4.0;
        } else if (nilai >= 80) {
            return 3.7;
        } else if (nilai >= 75) {
            return 3.3;
        } else if (nilai >= 70) {
            return 3.0;
        } else if (nilai >= 65) {
            return 2.7;
        } else if (nilai >= 60) {
            return 2.3;
        } else if (nilai >= 55) {
            return 2.0;
        } else if (nilai >= 50) {
            return 1.7;
        } else {
            return 0.0;
        }
    }
}
