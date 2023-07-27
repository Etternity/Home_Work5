import java.util.Scanner;

public class Task4_Premium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть заробітну плату працівника: ");
        double salary = scanner.nextDouble();

        System.out.print("Введіть вислугу років працівника: ");
        int yearsOfService = scanner.nextInt();

        double bonusPercentage;

        if (yearsOfService < 5) {
            bonusPercentage = 0.1;
        } else if (yearsOfService < 10) {
            bonusPercentage = 0.15;
        } else if (yearsOfService < 15) {
            bonusPercentage = 0.25;
        } else if (yearsOfService < 20) {
            bonusPercentage = 0.35;
        } else if (yearsOfService < 25) {
            bonusPercentage = 0.45;
        } else {
            bonusPercentage = 0.5;
        }

        double bonus = salary * bonusPercentage;
        double totalSalary = salary + bonus;

        System.out.println("Заробітна плата: " + salary);
        System.out.println("Премія: " + bonus);
        System.out.println("Загальна сума: " + totalSalary);
    }
}
