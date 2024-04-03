import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int wordsA = 0;
        int wordsB = 0;
        int wordsC = 0;
        int wordsD = 0;

        for (int i = 0; i < n; i++) {
            switch (scanner.next()) {
                case "A" -> ++wordsA;
                case "B" -> ++wordsB;
                case "C" -> ++wordsC;
                case "D" -> ++wordsD;
                default -> {
                }
            }
        }
        System.out.println(wordsD + " " + wordsC + " " + wordsB + " " + wordsA);
    }
}