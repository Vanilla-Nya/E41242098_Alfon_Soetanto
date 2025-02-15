package MingguKedua;
import java.util.Random;
import java.util.Scanner;

class WSIB_Week_3_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret: ");
        int jumlahDeret = scanner.nextInt();

        int[] deret = new int[jumlahDeret];
        Random random = new Random();

        for (int i = 0; i < jumlahDeret; i++) {
            deret[i] = random.nextInt(100); // Angka acak antara 0 dan 99
        }

        System.out.println("Deret angka acak:");
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
    }
}