import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int nMax = 1000000;
        int n = scanner.nextInt();
        System.out.print(n + " ");

        if (n <= nMax) {
            while (n != 1) {
                if (n % 2 != 0) {
                    n = n * 3 + 1;
                    System.out.print(n + " ");
                }
                n /= 2;
                System.out.print(n + " ");
            }
        }
    }
}