
import java.util.Scanner;
public class CarTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Car myCar1 = new Car("Toyota", "2023", 100_000);
        Car myCar2 = new Car("Bmw", "2004", 200_000);

        System.out.println("Car1 price: $" + myCar1.getPriceOfCar());
        System.out.println("Car2 price:" + myCar2.getPriceOfCar());

        double discount1 = myCar1.getPriceOfCar() * 0.05;
        double discountedPrice1 = myCar1.getPriceOfCar()- discount1;
        myCar1.setPriceOfCar(discountedPrice1);

        double discount2 = myCar2.getPriceOfCar() * 0.07;
        double discountedPrice2 = myCar2.getPriceOfCar()- discount2;
        myCar2.setPriceOfCar(discountedPrice2);

        System.out.println("Car1 price after 5% discount:$" + myCar1.getPriceOfCar());
        System.out.println("Car2 price after 7% discount:$" + myCar2.getPriceOfCar());



    }
}
