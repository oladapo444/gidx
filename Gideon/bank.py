from account import Account


class Bank:

    def __init__(self, name):
        self.name = name
        self.__accounts = []

    def deposit(self, account_number: int, amount: int):
        account = self.find_account(account_number)
        account.deposit(amount)

    def withdraw(self, account_number: int, amount: int, pin: str):
        account = self.find_account(account_number)
        account.withdraw(amount, pin)

    def register_account(self, last_name, first_name, pin):
        name = last_name + ", " + first_name
        account_number = self.generate_number()
        account = Account(name, account_number, pin)
        self.__accounts.append(account)
        return account

    def find_account(self, account_number):
        for account in self.__accounts:
            if account.account_number == account_number:
                return account

    def check_balance(self, account_number, pin):
        for account in self.__accounts:
            if account.account_number == account_number:
                return account.check_balance(pin)

    def transfer_money(self, sender_account_number: int, receiver_account_number: int, amount: int, pin: str):
        sender_account = self.find_account(sender_account_number)
        receiver_account = self.find_account(receiver_account_number)
        sender_account.withdraw(amount, pin)
        receiver_account.deposit(amount)

    @staticmethod
    def generate_number():
        account_number = 1
        account_number += 1
        return account_number

    def get_number_of_account(self):
        return len(self.__accounts)

