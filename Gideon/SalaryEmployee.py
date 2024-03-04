from decimal import Decimal

from commissionInheritance import CommissionEmployee


def valueError(param):
    pass


class salaryEmployee():
    def __init__(self, firstname, lastname, nin, sales, rate, base_pay, first_name=None, last_name=None):

        super().__init__(first_name, last_name, nin, sales, rate)
        self.base_pay = base_pay

        @property
        def pay(self):
            return self.base_pay

        @base_pay.setter
        def base_pay(self,pay):
            if pay <Decimal(0.0):
                raise valueError("invalid pay")
            self.base_pay = pay

            def earning(self):
                return  self.base_pay + super().earning()

            def __repr__(self):
                return f"{super().__repr__()}\n"\
                    f"Salary:{self.base_pay}\n"\
                        f"salary earning:{self.earning()}"

                izu = salaryEmployee("izu","miriam",430,10000,45,567,)
                print("izu")
                print(isinstance((izu,salaryEmployee)))
                print(issubclass(salaryEmployee,CommissionEmployee))



