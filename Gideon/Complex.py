from numbers import Complex
from turtle import left, right


class Complex:
    def __init__(self, left,right):
     self.left = left
     self.right = right

     def __add__(self, other):
         return f'Complex{self.left}j+{"+"if self.right>0 else"-"}{abs(self.right)}i'

    C1 = Complex(2,3)
    C2 = Complex(5, -2)
    C3 = Complex(2, 3)
    print(C1)
    print(C2)
    print(C1 + C2)
    print(C1 == C3)
    print(C2 < C1)

