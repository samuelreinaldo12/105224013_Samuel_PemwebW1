import java.util.Scanner;

public class Logicalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM LOGICALC FASTSEND ===");
        
        // 1. INPUT DATA
        System.out.print("Masukkan Nama Klien    : ");
        String namaKlien = input.nextLine();
        
        System.out.print("Masukkan Berat (Kg)    : ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan Jarak (Km)    : ");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan Jumlah Box    : ");
        int totalBox = input.nextInt();

        // 2. LOGIKA MANAJEMEN ARMADA
        int trukPenuh = totalBox / 150;
        int sisaBox = totalBox % 150;

        // 3. KALKULASI BIAYA
        double tarifJarak = 15000.0 * jarak;
        double tarifBerat = 5500.0 * berat;
        double dasarBiaya = tarifJarak + tarifBerat;
        
        // Asuransi 3.5% (0.035)
        double asuransi = dasarBiaya * 0.035;
        double totalBayar = dasarBiaya + asuransi;

        // 4. ESTIMASI WAKTU TIBA
        int estimasiJam = jarak / 60;
        int estimasiMenit = jarak % 60;

        // 5. OUTPUT (RESI PENGIRIMAN)
        System.out.println("  === RESI PENGIRIMAN ===");
        System.out.println("Klien           : " + namaKlien);
        System.out.println("Total Box       : " + totalBox + " box");
        System.out.println("Kebutuhan Armada: [" + trukPenuh + "] Truk Penuh dan sisa [" + sisaBox + "] box via Pikap.");
        System.out.println("");
        System.out.println("Estimasi Waktu  : [" + estimasiJam + "] Jam [" + estimasiMenit + "] Menit (Asumsi 60km/jam)");
        
        System.out.println("  === RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya     : Rp [" + dasarBiaya + "]");
        System.out.println("Asuransi (3.5%) : Rp [" + asuransi + "]");
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR     : Rp [" + totalBayar + "]");
        System.out.println("===================================");

        input.close();
    }
}