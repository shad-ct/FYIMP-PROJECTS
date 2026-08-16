/*
 * Question:
 * Create a class `Area` with overloaded methods `calculateArea()` to find the area of a square, rectangle, and circle. Demonstrate method overloading using appropriate parameters.
 */

class Area {

    // Area of square
    int calculateArea(int side) {
        return side * side;
    }

    // Area of rectangle
    int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    // Area of circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of square: "
                           + a.calculateArea(5));

        System.out.println("Area of rectangle: "
                           + a.calculateArea(10, 5));

        System.out.println("Area of circle: "
                           + a.calculateArea(7.0));
    }
}

/*
 * Output:
 * Area of square: 25
 * Area of rectangle: 50
 * Area of circle: 153.93804002589985
 * 
 */
