import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long numberA = scanner.nextLong();
        String symbol = scanner.next();
        long numberB = scanner.nextLong();

        switch (symbol) {
            case "+":
                long resultsAddition = numberA + numberB;
                System.out.println(resultsAddition);
                break;
            case "-":
                long resultsMinus = numberA - numberB;
                System.out.println(resultsMinus);
                break;
            case "*":
                long resultsMultiplication = numberA * numberB;
                System.out.println(resultsMultiplication);
                break;
            case "/":
                if (numberB != 0) {
                    long resultsDivision = numberA / numberB;
                    System.out.println(resultsDivision);
                } else {
                    System.out.println("Division by 0!");
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}