import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        String results = (number > 0) ? "YES" : "NO";
        System.out.println(results);
    }
}