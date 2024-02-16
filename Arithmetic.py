number1 = int(input("Enter a firstnumber:"))
number2 = int(input("Enter second number:"))
number3 = int(input("Enter third number"))

sum = number1 + number2 + number3
print("the sum of", sum)

average = sum/3
print("the average is",average)

product = number1 * number2 * number3
print("the product is", product)

if number1 > number2 and number1 > number3:
    print(number1)
if number2 > number1 and number2 > number3:
    print(number2)
if number3 > number1 and number3 > number2:
    print(number3)

    if number1 < number2 and number1 < number3:
        print(number1)
        if number2 < number1 and number2 < number3:
            print(number2)

            if number3 < number1 and number3 < number1:
                print(number3)



