class KartuKredit extends Pembayaran implements Keamanan {
    private String nomorKartu;

    public KartuKredit(String namaPembayar, double nominal, String nomorKartu) {
        super(namaPembayar, nominal); 
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
        double biayaAdmin = this.nominal * 0.02; // Hitung admin 2%
        double totalTagihan = this.nominal + biayaAdmin;
        
        System.out.println("Metode            : Kartu Kredit");
        System.out.println("Biaya Admin (2%)  : Rp" + biayaAdmin);
        System.out.println("Total Tagihan     : Rp" + totalTagihan);
    }

    @Override
    public boolean autentikasi() {
        System.out.println("[INFO] Autentikasi PIN berhasil.");
        return true;
    }
}