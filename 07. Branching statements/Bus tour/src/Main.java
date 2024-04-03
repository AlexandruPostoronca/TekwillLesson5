import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int numbersBridge = scanner.nextInt();
        int bridgeHeight;

        for (int i = 1; i <= numbersBridge; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if (i == numbersBridge)
                System.out.println("Will not crash");
        }
    }
}