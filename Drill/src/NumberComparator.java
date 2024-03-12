import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        int result = compareNumbers(num1, num2);

        System.out.println("Result: " + result);
    }

    public static int compareNumbers(double num1, double num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 > num2) {
            return 1;
        } else {
            return -1;
        }
    }
}

