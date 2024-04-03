import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = 1000;
        int sumAllNumbers = 0;
        int inputNumbers = scanner.nextInt();

        while (inputNumbers != 0) {
            sumAllNumbers += inputNumbers;
            if (sumAllNumbers >= number) {
                sumAllNumbers -= number;
                break;
            }
            inputNumbers = scanner.nextInt();
        }
        System.out.println(sumAllNumbers);
    }
}