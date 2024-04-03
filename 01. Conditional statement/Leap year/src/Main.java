import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numbersYear = scanner.nextInt();

        if (numbersYear >= 1900 && numbersYear <= 3000) {
            double results = numbersYear % 4;
            double results1 = numbersYear % 100;
            double results2 = numbersYear % 400;

            if ((results == 0 && results1 != 0) || results2 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}