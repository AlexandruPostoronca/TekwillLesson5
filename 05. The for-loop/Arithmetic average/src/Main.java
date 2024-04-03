import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int divisibleBy = 3;
        int sumElements = 0;
        double averageArithmetic = 0;

        for (int i = a; i <= b; i++) {
            if (i % divisibleBy == 0) {
                sumElements += i;
                ++averageArithmetic;
            }
        }
        System.out.println(sumElements/averageArithmetic);
    }
}