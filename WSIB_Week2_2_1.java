
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

        System.out.print("Kharisma Agung Plazza <KAP>" + "\n" +
        "Promo Belanja Berhadiah" + "\n" +
        "Khusus Pembelian 5 Barang Pertama" + "\n" +
        "Dengan Harga Minimum Rp. 10000,00" + "\n" +
        "--------------------------------------------" + "\n" +
        "Harga Barang ke-1: Rp. " + harga1 + "\n" +
        "Harga Barang ke-2: Rp. " + harga2 + "\n" +
        "Harga Barang ke-3: Rp. " + harga3+ "\n" +
        "Harga Barang ke-4: Rp. " + harga4+ "\n" +
        "Harga Barang ke-5: Rp. " +harga5+ "\n" +
        "Total Harga Pembelian Atas nama " + nama + "Denagn Total " + total + "\n" + 
        "\n" + 
        "Selamat...." + "\n" +
        "Anda Mendapat Hadiah 1 Buah Mug Cantik" + "\n" +
        "\n" +
        "--------------------------------------------" + "\n" +
        "Terimakasih" + "\n" +
        "Anda Sudah Belanja di Kharisma Agung Plazza" + "\n"
        );
    }
}