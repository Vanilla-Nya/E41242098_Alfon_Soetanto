import java.util.Scanner;

class WSIB_Week1 {
    public static int Answer;

    public static void Qustion(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("100 - 99 = ");
            Answer = sc.nextInt();
        }
        
        
        if (Answer == 1) {
            System.out.println("Right!");
        } else {
            System.out.println("Try Again!");
            Qustion();
        }
    }
    public static void main(String[] args) {
        Qustion();
    }
}