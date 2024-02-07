public class Car {
    private String ModelOfCar;
    private  String yearOfCar;
    private double priceOfCar;
    private double discount;


    public Car (String ModelOfCar,  String yearOfCar,  double priceOfCar ) {
        this.ModelOfCar = ModelOfCar;
        this.yearOfCar = yearOfCar;
        if (priceOfCar > 0){
            this.priceOfCar = priceOfCar;;
        }

    }
    public String getModelOfCar(){

        return ModelOfCar;
    }

    public  void setModelOfCar() {
        this.ModelOfCar = ModelOfCar;
    }

    public String getYearOfCar() {

        return yearOfCar;
    }

    public  void setYearOfCar(String yearOfCar) {

        this.yearOfCar = yearOfCar;
    }

    public double getPriceOfCar(){
        return priceOfCar;
    }
    public void setPriceOfCar(double priceOfCar) {
        this.priceOfCar = priceOfCar;
    }

    public double getDiscount() {
        return discount = priceOfCar - (discount / 100);
        }

    public void setDiscount(double discount1) {
        this.discount = discount1;
    }
}












