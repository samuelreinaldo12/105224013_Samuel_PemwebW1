class EWallet extends Pembayaran implements Keamanan {
    private String nomorHP;

    public EWallet(String namaPembayar, double nominal, String nomorHP) {
        super(namaPembayar, nominal); // Memanggil constructor induk (Pembayaran)
        this.nomorHP = nomorHP;
    }

    @Override
    public void prosesPembayaran() {
        // E-Wallet tidak ada biaya admin
        System.out.println("Metode            : E-Wallet");
        System.out.println("Biaya Admin       : Rp0 (Bebas Biaya)");
        System.out.println("Total Tagihan     : Rp" + this.nominal);
    }

    @Override
    public boolean autentikasi() {
        System.out.println("[INFO] Autentikasi berhasil.");
        return true;
    }
}