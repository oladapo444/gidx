import java.util.Scanner;
public class PetrolTest {
   public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("agege", "Regular", 50, 2.5, 5.0);

        System.out.println("StationLocation: " + purchase.getStationLocation());
        System.out.println("PetrolType: " + purchase.getPetrolType());
      System.out.println("Quantity: " + purchase.getQuantity() + " liters");
        System.out.println("Price perLiter: $" + purchase.getPricePerLiter());
        System.out.println("Discount: " + purchase.getDiscount() + "%");

        System.out.println("Net Purchase Amount: $" + purchase.getPurchaseAmount());
    }
}