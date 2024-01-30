import java.util.Scanner;
public class TimeTable {

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = 12;
                 for (int y = 1; y <= 12; y++) {
            for (int x = 1; x <= 12; x++) {
                System.out.print(x * y + " ");
            }
            System.out.println();
     	  		 }
		}
	}

