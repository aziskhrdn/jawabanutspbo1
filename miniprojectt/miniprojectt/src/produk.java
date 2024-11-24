public class produk {
    private String namaproduk;
    private int harga;

    public produk(String namaproduk, int harga) {
        this.namaproduk = namaproduk;
        this.harga = harga;
    }

    public String getNama() {
        return namaproduk;
    }

    public int getHarga() {
        return harga;
    }
    //Operator Aritmatika
    public int hitungpembelian(int jumlahdibeli) {
        return harga * jumlahdibeli;
    }
}