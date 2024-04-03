import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your solution here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int d;

        if (a + b == c) {
            d = c;
        } else {
            d = 10;
        }
        System.out.println(d);
        d = a + b != c ? 10 : c;
        System.out.println(d);
    }
}