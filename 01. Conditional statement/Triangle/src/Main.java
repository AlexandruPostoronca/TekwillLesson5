import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numbersA = scanner.nextInt();
        int numbersB = scanner.nextInt();
        int numbersC = scanner.nextInt();

        String result = (numbersA + numbersB > numbersC && numbersA + numbersC > numbersB && numbersB + numbersC > numbersA) ? "YES" : "NO";
        System.out.println(result);
    }
}