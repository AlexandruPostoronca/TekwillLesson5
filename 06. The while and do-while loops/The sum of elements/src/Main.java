import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sumAllElements = 0;
        int numbers = scanner.nextInt();

        while (numbers != 0) {
            sumAllElements += numbers;
            numbers = scanner.nextInt();
        }
        System.out.println(sumAllElements);
    }
}