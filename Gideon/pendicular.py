def perpendicular_axis(x1, y1, x2, y2):
    if x1 == x2:
        print("The points are located on a line perpendicular to the y-axis.")
    elif y1 == y2:
        print("The points are located on a line perpendicular to the x-axis.")
    else:
        print("The points are not located on a line perpendicular to either axis.")


if __name__ == "__main__":
    try:
        x1 = float(input("Enter the x-coordinate of the first point: "))
        y1 = float(input("Enter the y-coordinate of the first point: "))
        x2 = float(input("Enter the x-coordinate of the second point: "))
        y2 = float(input("Enter the y-coordinate of the second point: "))

        perpendicular_axis(x1, y1, x2, y2)
    except ValueError:
        print("Please enter valid coordinates.")