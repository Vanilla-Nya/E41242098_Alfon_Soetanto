import java.util.Scanner;

public class WSIB_Week2_2_2 {
    
    public Scanner sc = new Scanner(System.in);
    public String nama;
    public void main(String[] args) {
        System.out.println("CAFE CERIA" + "\n" +
        "ANEKA MINUMAN" + "\n" +
        "-----------------" + "\n" +
        "1. Soft drinks" + "\n" +
        "2. Mix juice" + "\n" +
        "3. Nescafe" + "\n" +
        "4. Soda milk" + "\n" +
        "5. Tea" + "\n" +
        "-----------------");

        System.out.print("Masukan Nama Pembeli : ");
        nama = sc.nextLine();
        System.out.print("Silahkan Masukan Pilihan Anda : ");
        int pilihan = sc.nextInt();
        
        String Tambahan = "pesanan anda akan segera kami antar" + "\n" +
        "Terima Kasih " + nama + " Telah Berkunjung di Cafe Ceria";

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks" + "\n" + Tambahan);
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice" + "\n" + Tambahan);
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe" + "\n" + Tambahan);
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk" + "\n" + Tambahan);
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea" + "\n" + Tambahan);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
    }
}
