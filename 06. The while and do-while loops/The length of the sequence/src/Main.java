import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int numbersInput = 0;

        while (n!=0){
             n = scanner.nextInt();
            ++numbersInput;
        }
        System.out.println(numbersInput);
    }
}