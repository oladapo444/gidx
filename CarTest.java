public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota",789,2023,13);
        car.setNameOfCar("Toyota");
        car.setNumberOfCar(567);
        car.setYearOfCar(2023);
        car.setModelOfCar(13);
        System.out.println(car.getNameOfCar());
        System.out.println(car.getNumberOfCar());
        System.out.println(car.getYearOfCar());
        System.out.println(car.getModelOfCar());

    }
}
