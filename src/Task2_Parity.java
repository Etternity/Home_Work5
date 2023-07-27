import java.util.Scanner;

public class Task2_Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число:");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Число є парним.");
        } else {
            System.out.println("Число є непарним.");
        }
        if (num % 2 == 0) {
            System.out.println("Число є парним.");
        } else {
            System.out.println("Число є непарним.");
        }


    }
}
