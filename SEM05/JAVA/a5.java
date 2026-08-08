public class a5 {

    public static void main(String[] args) {
        int year = 2024;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }

    }
}
