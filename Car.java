public class Car {
    private String nameOfCar;
    private int numberOfCar;
    private int yearOfCar;
    private int ModelOfCar;

    public Car(String nameOfCar, int numberOfCar, int yearOfCar, int ModelOfCar) {
        this.nameOfCar = nameOfCar;
        this.numberOfCar = numberOfCar;
        this.yearOfCar = yearOfCar;
        this.ModelOfCar = ModelOfCar;

    }

    public String getNameOfCar() {

        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {

        this.nameOfCar = nameOfCar;
    }

    public int getNumberOfCar() {

        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {

        this.numberOfCar = numberOfCar;
    }

    public int getYearOfCar() {
        return yearOfCar;
    }

    public void setYearOfCar(int i) {
        this.yearOfCar = yearOfCar;
    }

    public int getModelOfCar() {
        return ModelOfCar;
    }

    public int setModelOfCar(int i) {
        this.ModelOfCar = ModelOfCar;
        return i;
    }
}







