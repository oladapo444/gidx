import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integerA");
        int num1 = input.nextInt();
        System.out.print("Enter an integerB");
        int num2 = input.nextInt();
        System.out.print("Enter an integerC");
        int num3 = input.nextInt();
        System.out.print("Enter an integerD");
        int num4 = input.nextInt();
        System.out.print("Enter an integerE");
        int num5 = input.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("The largest number is :" + num1);
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("The largest number is :" + num2);
        }

        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("The largest number is :" + num3);
        }

        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("The largest number is :" + num4);
        }
        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println("The largest number is :" + num5);
        }


        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("The smallest number is :" + num1);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.println("The Smallest number is :" + num2);
        }
        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
            System.out.println("The Smallest number is :" + num3);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
        System.out.println("The smallest number is :" + num4);
            }
        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
            System.out.println("The smallest number is :" + num5);

    }
}
}
