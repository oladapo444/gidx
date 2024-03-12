from account import Account


class BankApp:
    def __init__(self, bank_name):
        self.bank_name = bank_name
        self.account = None

    def main_menu(self):
        print("Welcome to ", self.bank_name)
        print("1. Open Account")
        print("2. Deposit")
        print("3. Withdraw")
        print("4. Transfer Money")
        print("5. Check Balance")
        print("6. Buy_Airtime")
        print("7. Exit")

        choice = input("Choose an option (1-7): ")

        if choice == "1":
            self.open_account()
        elif choice == "2":
            self.deposit()
        elif choice == "3":
            self.withdraw()
        elif choice == "4":
            self.transfer_money()
        elif choice == "5":
            self.check_balance()
        elif choice == "6":
            self.buy_Airtime()
        elif choice == "7":
            print("Thank you for banking with us!")
            exit()
        else:
            print("Invalid choice. Please choose from 1 to 7.")

    def open_account(self):
        name = input("Enter your first_name: ")
        name =input("Enter your last_name:")
        initial_balance = float(input("Enter your initial balance: "))
        self.account = BankApp(name)
        print("Account opened successfully.")

    def deposit(self):
        if self.account:
            amount = float(input("Enter amount to deposit: "))
            self.account.deposit(amount)
        else:
            print("You must open an account first.")

    def withdraw(self):
        if self.account:
            amount = float(input("Enter amount to withdraw: "))
            self.account.withdraw(amount)
        else:
            print("You must open an account first.")

    def transfer_money(self):
        if self.account:
            amount = float(input("Enter amount to transfer: "))

        else:
            print("You must open an account first.")

    def check_balance(self):
        if self.account:
            self.account.display_balance()
        else:
            print("You must open an account first.")

    def buy_Airtime(self):
        if self.account:
            amount = float(input("Enter amount to buy Airtime"))
        else:
            print("no money in my account")


def main():
    bank_app = BankApp("GIDX Bank")
    while True:
        bank_app.main_menu()
        input("Press Enter to continue...")

if __name__ == "__main__":
    main()