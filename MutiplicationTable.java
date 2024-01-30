import java.util.Scanner;
public class MutiplicationTable {
public static void main(String [] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number from 1 - 12");
 int number = scanner.nextInt();

if(number < 1 || number > 12) {
System.out.print("invalid");
}
for (int i = 1; i <= 12; i++) {		
System.out.println(number + " x "+ i + " = " + (number * i));
		}
	}
}


				
						
	