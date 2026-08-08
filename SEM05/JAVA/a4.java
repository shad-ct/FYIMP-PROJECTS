public class a4 {

    public static void main(String[] args) {

        int a = 10, b = 25, c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is largest");
            } else {
                System.out.println(c + " is largest");
            }
        }
    }
}
