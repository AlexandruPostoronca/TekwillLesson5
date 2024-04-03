import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numbers = scanner.nextInt();
        int numbersLargest = 0;

        while (numbers != 0) {
            if (numbers > numbersLargest)
                numbersLargest = numbers;
            numbers = scanner.nextInt();
        }
        System.out.println(numbersLargest);
    }
}