import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numElements = scanner.nextInt();
        int sumaDivisible6 = 0;

        for (int i = 0; i < numElements; i++) {
            int b = scanner.nextInt();
            if (b % 6 == 0) {
                sumaDivisible6 += b;
            }
        }
        System.out.println(sumaDivisible6);
    }
}