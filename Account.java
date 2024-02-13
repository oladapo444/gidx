public  class Account {
    private String name;
    private double balance;

    public Account(String name ,double initialBalance) {
        this.name = name;
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }else {
            System.out.println("initial balance must be greater than 0.0");
        }
    }
    public void  deposit(double depositAmount){
        if(depositAmount > 0.0) {
            balance += depositAmount;
        }else {
            System.out.println("Deposit amount must be greater than 0.0");
        }
    }
    public void withdraw(double withdrawerAmount) {
        if (withdrawerAmount < balance) {
            System.out.println("insufficient funds for withdrawal");
        } else {
            balance -= withdrawerAmount;
        }
    }

    public  double getBalance() {

        return balance;
    }

    public void setName(String name) {

        this.name = name;
    }
    public String getName(){
        return name;
    }
}

