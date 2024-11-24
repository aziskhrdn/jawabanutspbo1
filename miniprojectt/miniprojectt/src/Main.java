import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==Selamat Datang Di Aplikasi Belanja Keripik Serba Sepuluh==");
        System.out.println("Masukan Username dan Password Anda");

        // login <<Komentar
        System.out.println("Masukan Username: ");
        String username = input.nextLine();

        System.out.println("Masukan Password: ");
        String password = input.nextLine();


        login login = new login(username, password);
        if (!login.validasi()) {
            System.out.println("Login gagal!");
            return;
        }
        System.out.println("Berhasil Login");

        // daftar produk (array)
        produk[] daftarproduk = new produk[7];
        daftarproduk[0] = new produk("Keripik Bayam", 10000);
        daftarproduk[1] = new produk("Keripik Pisang", 10000);
        daftarproduk[2] = new produk("Keripik Singkong", 10000);
        daftarproduk[3] = new produk("Keripik Ubi Merah", 10000);
        daftarproduk[4] = new produk("Keripik Kentang", 10000);
        daftarproduk[5] = new produk("Rempeyek Kacang", 10000);
        daftarproduk[6] = new produk("Rempeyek Udang", 10000);

        // menampilkan produk
        System.out.println("=====Daftar Produk=====");
        for (produk p : daftarproduk) {
            System.out.println("Nama Produk: " + p.getNama() + " | Harga: Rp. " + p.getHarga());
        }
        System.out.println("Pilih salah satu Produk: ");
        String pilihan = input.nextLine();

        System.out.println("Jumlah Pembelian: ");
        int jumlahbeli = input.nextInt();
        input.nextLine();

        //Operator Aritmatika
        int totalharga = daftarproduk[0].hitungpembelian(jumlahbeli);
        System.out.println("Total yang harus di bayar: Rp. " + totalharga);
        System.out.println("Masukan PIN anda: ");
        String pin = input.nextLine();

        //casting
        pembayaran bayar = new pembayaran(pin);
        if (!bayar.validpin()) {
            System.out.println("PIN yang anda masukan salah!");
            return;
        }
        System.out.println("==Transaksi Berhasil dilakukan==");

        //Operator Logika
        if(totalharga >= 50000){
            System.out.println("Karena Transaksi melebihi Rp.50000,");
            System.out.println("Maka anda mendapatkan 1 pcs keripik bayam gratis! :)");
            System.out.println("Terimakasih sudah Berbelanja...");
        } else{
            System.out.println("Terimakasih sudah Berbelanja...");
        }
        alamat alamat = new alamat("Keripik Serba Sepluh","JL. Rancabentang, Kota Cimahi.");
        alamat.display();
        alamat.asalbrand();

        input.close();
    }
}
