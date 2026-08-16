/*
 * Question:
 * Create a class `Rectangle` with overloaded constructors to initialize a rectangle with default values, length and breadth, and a square using a single value. Write a method to calculate and display the area.
 */

class Rectangle {
    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Constructor for rectangle
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Constructor for square
    Rectangle(int side) {
        length = side;
        breadth = side;
    }

    void displayArea() {
        System.out.println("Area = " + (length * breadth));
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
        Rectangle r3 = new Rectangle(7);

        System.out.println("Default rectangle:");
        r1.displayArea();

        System.out.println("Rectangle:");
        r2.displayArea();

        System.out.println("Square:");
        r3.displayArea();
    }
}

/*
 * Output:
 * Default rectangle:
 * Area = 1
 * 
 * Rectangle:
 * Area = 50
 * 
 * Square:
 * Area = 49
 * 
 */
