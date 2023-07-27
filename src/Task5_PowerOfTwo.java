import java.util.Scanner;
public class Task5_PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число:");
        long num = sc.nextLong();
        if ((num & (num - 1)) == 0) {
            System.out.println((byte)num + ":є ступенем двійки");
        } else {
            System.out.println(num + ":Не є ступенем двійки");
        }
    }
}
