package MingguKetiga;

import java.util.Scanner;

public class WSIB_Week3_1_1 {
    public Scanner sc = new Scanner(System.in);
    public int angka1;
    public int angka2;
    public void main(String[] args) {
        System.out.print("Masukan Angka Pertama :");
        angka1 = sc.nextInt();
        System.out.print("Masukan Angka Kedua :");
        angka2 = sc.nextInt();

       
        for (int i = angka1; i <= angka2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}