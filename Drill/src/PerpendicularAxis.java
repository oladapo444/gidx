
import java.util.Scanner;

public class PerpendicularAxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();


        if (x1 == x2) {
            System.out.println("The points are located on a line perpendicular to the y-axis.");
        } else if (y1 == y2) {
            System.out.println("The points are located on a line perpendicular to the x-axis.");
        } else {
            System.out.println("The points are not located on a line perpendicular to either axis.");
        }
    }
}
