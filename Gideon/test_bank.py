import account
from account import Account
from bank import Bank

import unittest


class TestBank(unittest.TestCase):

    def setUp(self):
        self.bank = Bank("gidx")
        self.account = self.bank.register_account("lastname", "firstname", "pin")

    def test_account_creation(self):
        self.account1 = self.bank.register_account("Oladapo", "Olamide", "1111")
        self.account2 = self.bank.register_account("Otusaya", "emmanuel", "5555")
        self.account3= self.bank.register_account("ore", "reve", "4444")
        self.assertEqual(4, self.bank.get_number_of_account())

    def test_for_deposit(self):
        account_number = self.bank.generate_number()
        self.bank.deposit(account_number, 3000)
        self.assertEqual(self.bank.check_balance(account_number, "pin"), 3000)

    def test_for_withdraw(self):
        account_number = self.bank.generate_number()
        self.bank.deposit(account_number, 3000)

        self.bank.withdraw(account_number, 1000, "pin")

        self.assertEqual(self.bank.check_balance(account_number, "pin"), 2000)

    def test_check_balance(self):
        account_number = self.bank.generate_number()
        self.bank.deposit(account_number, 200)
        self.bank.check_balance(account_number, "pin")
        self.assertEqual(self.bank.check_balance(account_number, "pin"), 200)

    def test_to_find_account(self):
        account_number = self.bank.generate_number()
        self.assertTrue(self.bank.find_account(account_number))

    def test_remove_account(self):
        account_number = self.bank.generate_number()
        self.assertTrue(self.bank.find_account(account_number))
