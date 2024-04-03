import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numbersPartLarger = 0;
        int numbersPartSmaller = 0;
        int numbersPartPerfect = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            switch (scanner.nextInt()) {
                case -1 -> ++numbersPartSmaller;
                case 0 -> ++numbersPartPerfect;
                case 1 -> ++numbersPartLarger;
                default -> {
                }
            }
        }
        System.out.println(numbersPartPerfect + " " + numbersPartLarger + " " + numbersPartSmaller);
    }
}