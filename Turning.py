def main():
    print("What is your problem?")
    input()
    print("Have you had this problem before (yes or no)?")
    user_response = input().lower()
    if user_response == "yes":
        print("Well, you have it again.")
    elif user_response == "no":
        print("Well, you have it now.")
    else:
        print("Invalid response. Please answer with 'yes' or 'no'.")

if __name__ == "__main__":
    main()