package Task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi Mata Uang
        System.out.println("\n3. Konversi Mata Uang:");
        double rupiah = 1_500_000.75; // 1.5 juta rupiah
        int dolar = (int) (rupiah / 15_000); // Hilang pecahan
        System.out.println("Rupiah asli: " + rupiah);
        System.out.println("Setelah dikonversi ke dollar (int): " + dolar);

        // Kasus 4: Pengukuran Jarak GPS
        System.out.println("\n4. Pengukuran Jarak GPS:");
        double jarakAsli = 12345.678901234; // meter
        float jarakPendek = (float) jarakAsli; // Presisi hilang
        System.out.println("Jarak asli (double): " + jarakAsli);
        System.out.println("Jarak setelah casting ke float: " + jarakPendek);

        // Kasus 5: Perhitungan Waktu dengan Milidetik
        System.out.println("\n5. Perhitungan Waktu Milidetik:");
        long waktuMs = 3_000_000_000L; // 3 miliar ms (50 menit)
        int waktuInt = (int) waktuMs; // Overflow
        System.out.println("Waktu asli (long): " + waktuMs);
        System.out.println("Waktu setelah casting ke int: " + waktuInt);
    }
}
