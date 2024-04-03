import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long m = scanner.nextLong();
        long n = 1;
        int counterFactorial = 1;

        while (n <= m) {
            ++counterFactorial;
            n*=counterFactorial;
        }
        System.out.println(counterFactorial);
    }
}