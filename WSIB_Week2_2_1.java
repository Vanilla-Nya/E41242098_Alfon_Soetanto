
import java.util.Scanner;


public class WSIB_Week2_2_1 {
    public double harga1, harga2, harga3, harga4, harga5, total;
    public String nama;
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Anda = ");
        nama = sc.nextLine();
        System.out.print("Masukan Harga Barang 1 = ");
        harga1 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 2 = ");
        harga2 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 3 = ");
        harga3 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 4 = ");
        harga4 = sc.nextDouble();
        System.out.print("Masukan Harga Barang 5 = ");
        harga5 = sc.nextDouble();

        total = harga1 + harga2 + harga3 + harga4 + harga5;

        
        String[] HasilAkhir = {"Kharisma Agung Plazza <KAP>" , "Promo Belanja Berhadiah" , "Khusus Pembelian 5 Barang Pertama" , "Dengan Harga Minimum Rp. 10000,00" , "--------------------------------------------" , "Harga Barang ke-1: Rp. " + harga1 , "Harga Barang ke-2: Rp. " + harga2 , "Harga Barang ke-3: Rp. " + harga3 , "Harga Barang ke-4: Rp. " + harga4 , "Harga Barang ke-5: Rp. " + harga5 , "Total Harga Pembelian Atas nama " + nama + "Denagn Total " + total , "Selamat...." , "Anda Mendapat Hadiah 1 Buah Mug Cantik" , "--------------------------------------------" , "Terimakasih" , "Anda Sudah Belanja di Kharisma Agung Plazza"};
        String[] HasilAkhirTidakdapat = {"Kharisma Agung Plazza <KAP>" , "Promo Belanja Berhadiah" , "Khusus Pembelian 5 Barang Pertama" , "Dengan Harga Minimum Rp. 10000,00" , "--------------------------------------------" , "Harga Barang ke-1: Rp. " + harga1 , "Harga Barang ke-2: Rp. " + harga2 , "Harga Barang ke-3: Rp. " + harga3 , "Harga Barang ke-4: Rp. " + harga4 , "Harga Barang ke-5: Rp. " + harga5 , "Total Harga Pembelian Atas nama " + nama + "Denagn Total " + total , "Selamat...." , "Anda Tidak Mendapatkan Hadiah" , "--------------------------------------------" , "Terimakasih" , "Anda Sudah Belanja di Kharisma Agung Plazza"};
        
        if (total == 100000) {
            for (int i = 0; i < HasilAkhir.length; i++) {
                System.out.println(HasilAkhir[i]);
            }
        } else {
            for (int i = 0; i < HasilAkhirTidakdapat.length; i++) {
                System.out.println(HasilAkhirTidakdapat[i]);
            }
        }

    }
}