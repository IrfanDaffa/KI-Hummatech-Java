public class tugas5 {
    // Konstanta
    public static final String namaToko = "Parfum HummaFragrant";
    public static final int hargaPokok = 50000;
    
    // Variabel
    public static int hargaPromo;
    public static int hargaReseller;
    
    public static void main(String[] args) {
        hargaPromo = hargaPokok - 10000;
        hargaReseller = hargaPokok - 20000;
    
        System.out.println("Nama Toko: " + namaToko);
        System.out.println("Harga Pokok: " + hargaPokok);
        System.out.println("Harga Promo: " + hargaPromo);
        System.out.println("Harga Reseller: " + hargaReseller);
    }
}
