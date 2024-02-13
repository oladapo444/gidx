 public class PetrolPurchase {
     private String stationLocation;
     private String petrolType;
     private int quantity;
     private double pricePerLiter;
     private double discount;

     public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLiter, double discount) {
         this.stationLocation = stationLocation;
         this.petrolType = petrolType;
         this.quantity = quantity;
         this.pricePerLiter = pricePerLiter;
         this.discount = discount;


     }

     public String getStationLocation(){
         return stationLocation;
     }

     public void setStationLocation(String stationLocation) {
         this.stationLocation = stationLocation;
     }

     public String getPetrolType() {
         return petrolType;
     }

     public void setPetrolType(String petrolType) {
         this.petrolType = petrolType;
     }

     public int getQuantity() {
         return quantity;
     }

     public void setQuantity(int quantity) {
         this.quantity = quantity;
     }

     public double getPricePerLiter() {
         return pricePerLiter;
     }

     public void setPricePerLiter(double pricePerLiter) {
         this.pricePerLiter = pricePerLiter;
     }

     public double getDiscount() {
         return discount;
     }

     public void setDiscount(double discount) {
         this.discount = discount;
     }

     public double getPurchaseAmount() {
         double totalAmount = quantity * pricePerLiter;
         double discountAmount = (discount / 100) * totalAmount;
         return totalAmount-(getDiscount());

     }
 }