import java.util.ArrayList;
import java.util.List;

abstract class Pembayaran {
    protected String namaPembayar;
    protected double nominal;

    public Pembayaran(String namaPembayar, double nominal) {
        this.namaPembayar = namaPembayar;
        this.nominal = nominal;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Pembayar     : " + this.namaPembayar);
        System.out.println("Nominal Transaksi : Rp" + this.nominal);
    }

    public abstract void prosesPembayaran();
}