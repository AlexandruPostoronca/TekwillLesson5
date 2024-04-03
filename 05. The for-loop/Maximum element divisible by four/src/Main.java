import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numMax = 30000;
        int numElementsMax = 1000;

        int numElements = scanner.nextInt();
        int numMaxDivisible4 = 0;

        if (numElements <= numElementsMax) {
            for (int i = 0; i < numElements; i++) {
                int element = scanner.nextInt();
                if (element <= numMax) {
                    if (element % 4 == 0 && numMaxDivisible4 < element) {
                        numMaxDivisible4 = element;
                    }
                }
            }
            System.out.println(numMaxDivisible4);
        }
    }
}
