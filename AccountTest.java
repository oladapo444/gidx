import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {


        Account account1 = new Account("Oladapo Olamide",70000);
        Account account2 = new Account("Oladapo Gideon",2347567.53);

        Scanner input = new Scanner(System.in);

        System.out.printf("Account Name: %s, balance: $%.2f%n",account1.getName(), account1.getBalance());
        System.out.printf("Account Name: %s, balance: $%.2f%n",account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account1: ");
        double WithdrawalAmount1 = input.nextDouble();


        System.out.printf("%nsubtracting %.2f to account1 balance%n%n", WithdrawalAmount1);
        account1.withdraw(WithdrawalAmount1);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter withdrawal amount for account2: ");
        double WithdrawalAmount2 = input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n", WithdrawalAmount2);
        account2.withdraw(WithdrawalAmount2);

        System.out.printf("Account Name: %s, balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("Account Name: %s, balance: $%.2f%n", account2.getName(), account2.getBalance());
    }

}