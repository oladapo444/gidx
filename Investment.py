initial_amount = float(input("Enter the initial_amount"))
interest_rate = float(input("Enter the interest_rate"))
annual_interest = initial_amount
year_interest = initial_amount *(1+interest_rate)

total_interest = year_interest
for year in range(1, 31):
    total_amount = total_interest *(1+interest_rate) + annual_interest
    print(f"At the end of year {year}, the total amount is ${total_amount:.2f}")

