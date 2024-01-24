import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer one ");

        float number1 = input.nextFloat();

        System.out.print("Enter an integer two ");

        float number2 = input.nextFloat();

        float square1 = number1 * 2;

        float square2 = number2 *2;

	float different = square1 - square2;

        System.out.println("square of integer one : "+ square1 );
	System.out.println("square of integer two :  "+square2);
	System.out.println("The different of square1 and square2 is:" + different);



    }


}