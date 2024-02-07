
import java.util.Scanner;
public class CarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Car myCar1 = new Car("Toyota", "2023", 100_000);
        Car myCar2 = new Car("Bmw", "2004", 200_000);

        System.out.println("enter the price of car1");
        double price1 = input.nextDouble();
        myCar1.setPriceOfCar(price1);

        System.out.println("enter the discount of car1");
        double discount1 = input.nextDouble();
        myCar1.setDiscount(7);

        System.out.println("enter the price of car2");
        double price2 = input.nextDouble();
        myCar2.setPriceOfCar(price2);

        System.out.println("enter the discount of car2");
        double discount2 = input.nextDouble();
        myCar2.setDiscount(7);

    }
}
