def number_comparator(num1, num2):
    if num1 == num2:
        return 0
    elif num1 > num2:
        return 1
    else:
        return -1

if __name__ == "__main__":
    try:
        num1 = float(input("Enter the first number: "))
        num2 = float(input("Enter the second number: "))
        result = number_comparator(num1, num2)
        print("Result:", result)
    except ValueError:
        print("Please enter valid numbers.")