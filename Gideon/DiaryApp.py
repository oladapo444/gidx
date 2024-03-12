class Diary:
    def __init__(self):
        self.entries = []

def main():
    diary = Diary()
    while True:
        print("\n1. Add Entry")
        print("2. Display Entries")
        print("3. Delete Entry")
        print("4. Exit")

        choice = input("Enter your choice (1-4): ")

        if choice == "1":
            entry = input("Enter your diary entry: ")
            diary.add_entry(entry)
            print("Entry added successfully.")
        elif choice == "2":
            diary.display_entries()
        elif choice == "3":
            entry_number = int(input("Enter the entry number to delete: "))
            diary.delete_entry(entry_number)
        elif choice == "4":
            print("Exiting the diary application.")
            break
        else:
            print("Invalid choice. Please choose from 1 to 4.")


if __name__ == "__main__":
    main()