import unittest
class commissionInheritance(unittest.TestCase):
    def test_commissionInheritance(self):
        class A(object)
            def __init__(self):
                @property
                def rate(self):
                    return self._rate

                @rate.setter
                def rate(self, rate):
                    if Decimal(0.0)< rate < Decimal(1.0):
                        raise valueError("invalid rate amount")
                    self._rate = rate

                    def earning(self):
                        return self.sales * self.rate

                    def __repr__(self)
                        return f"first Name: {self._firstName},last Name: {self._last_Name}\n"\
                            f"Nin:{self._nin}"
