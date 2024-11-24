import java.util.Scanner;
    //inheritance
    public class alamat extends brand {
    private String lokasi;
    public alamat(String namabrand, String lokasi){
        super(namabrand);
        this.lokasi = lokasi;
}
    public void asalbrand(){
        System.out.println("alamat: " +lokasi);
    }
}
