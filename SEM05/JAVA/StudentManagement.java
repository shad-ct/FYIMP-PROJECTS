/*
 * Question:
 * Create a class `Student` with `name`, `rollNo`, and `mark`. Implement default and parameterized constructors, a method `display()` to display student details, and overloaded methods `calculateGrade()` for different types of marks. Create multiple student objects and demonstrate garbage collection by making some objects eligible for garbage collection. 
 * 
 * The sheet doesn't specify the exact grade scale or which mark types should be used, so the following uses `int` and `double` with a conventional A–F scale.
 */

class Student {

    String name;
    int rollNo;
    double mark;

    // Default constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
        mark = 0;
    }

    // Parameterized constructor
    Student(String name, int rollNo, double mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark = mark;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + calculateGrade(mark));
        System.out.println();
    }

    // Grade calculation for integer marks
    char calculateGrade(int mark) {
        if (mark >= 90)
            return 'A';
        else if (mark >= 80)
            return 'B';
        else if (mark >= 70)
            return 'C';
        else if (mark >= 60)
            return 'D';
        else
            return 'F';
    }

    // Grade calculation for double marks
    char calculateGrade(double mark) {
        if (mark >= 90)
            return 'A';
        else if (mark >= 80)
            return 'B';
        else if (mark >= 70)
            return 'C';
        else if (mark >= 60)
            return 'D';
        else
            return 'F';
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        // Default constructor
        Student s1 = new Student();

        // Parameterized constructors
        Student s2 = new Student("Arun", 101, 85);
        Student s3 = new Student("Anu", 102, 92);
        Student s4 = new Student("Rahul", 103, 67);

        // Display details
        s1.display();
        s2.display();
        s3.display();
        s4.display();

        // Make objects eligible for garbage collection
        s1 = null;
        s4 = null;

        // Request garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}

/*
 * Output:
 * Name: Unknown
 * Roll No: 0
 * Mark: 0.0
 * Grade: F
 * 
 * Name: Arun
 * Roll No: 101
 * Mark: 85.0
 * Grade: B
 * 
 * Name: Anu
 * Roll No: 102
 * Mark: 92.0
 * Grade: A
 * 
 * Name: Rahul
 * Roll No: 103
 * Mark: 67.0
 * Grade: D
 * 
 * Garbage collection requested.
 * 
 */
