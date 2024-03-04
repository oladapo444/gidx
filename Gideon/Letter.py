from String import String


def count_letters_digits(String):
letters = 0
Digits = 0
for char in sentence:
    if char.isletter():
        letters += 1
    elif char.isdigit():
        Digits += 1
return letters, Digits


def main():
    sentence = input("Enter a sentence: ")
    letter_count, digit_count = count_letters_digits(sentence)
    print("LETTERS", letter_count, "DIGITS", digit_count)

if __name__ == "__main__":
    main()









