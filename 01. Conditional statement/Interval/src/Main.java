import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value = scanner.nextInt();

        boolean valueNumber1 = (value > -15 && value <= 12);
        boolean valueNumber2 = (value > 14 && value < 17);
        boolean valueNumber3 = (value >= 19 && value < Double.POSITIVE_INFINITY);

        if (valueNumber1 || valueNumber2 || valueNumber3) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}