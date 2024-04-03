import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();//2008

        int i4 = number % 10;//8
        int i3 = (number / 10) % 10;//0
        int i2 = (number / 100) % 10;//0
        int i1 = number / 1000;//2

        if (i1 == i4 && i2 == i3) {
            System.out.println(1);
        } else {
            System.out.println(number);
        }
    }
}