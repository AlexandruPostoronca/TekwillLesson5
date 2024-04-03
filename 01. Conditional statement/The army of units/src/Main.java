import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int unitsArmy = scanner.nextInt();

        if (unitsArmy < 1) {
            System.out.println("no army");
        } else if (unitsArmy >=1 && unitsArmy <= 19) {
            System.out.println("pack");
        } else if (unitsArmy >= 20 && unitsArmy <= 249) {
            System.out.println("throng");
        } else if (unitsArmy >= 250 && unitsArmy <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}