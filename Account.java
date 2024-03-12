import InsufficientFundException.insufficientFundException;

public class Account {
    private String name;

    private String pin;

    private int balance;

    private int amount;

    public Account(String name, int account_number, String pin) {
        this.name = name;
        this.pin = pin;

    }

    public void deposit(int amount) {
        if (amount < 0)
            try {
                throw new InvalidAmountException("Invalid amount");
            } catch (InvalidAmountException e) {
                throw new RuntimeException(e);
            }
        balance += amount;

    }

    public void withdraw(int amount) {
        if (balance < amount)
            try {
                throw new insufficientFundException("Insufficient fund");
            } catch (insufficientFundException e) {
                throw new RuntimeException(e);

            }

        balance -= amount;
    }
    public  void Check_balance(String pin, int account_number){
        if
}
    public int getBalance() {
        return balance;

    }
}