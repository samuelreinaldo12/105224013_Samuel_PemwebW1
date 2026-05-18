import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat list untuk menampung berbagai jenis pembayaran (Polymorphism)
        List<Pembayaran> daftarTransaksi = new ArrayList<>();

        Pembayaran trx1 = new KartuKredit("Samuel Reinaldo", 1000000, "1234-5678-9012-3456");
        Pembayaran trx2 = new EWallet("Josephina Vania", 500000, "081234567890");

        daftarTransaksi.add(trx1);
        daftarTransaksi.add(trx2);

        System.out.println("=== SISTEM PEMBAYARAN DIGITAL ===");

        for (Pembayaran trx : daftarTransaksi) {
            System.out.println("\n----------------------------------");
            trx.tampilkanDetail(); 
            
            if (trx instanceof Keamanan) {
                Keamanan sistemAman = (Keamanan) trx;
                
                if (sistemAman.autentikasi()) {
                    trx.prosesPembayaran();
                } else {
                    System.out.println("Autentikasi gagal! Transaksi dibatalkan.");
                }
            } else {
                System.out.println("Transaksi ditolak: Sistem tidak memiliki standar keamanan.");
            }
        }
        System.out.println("----------------------------------");
    }
}