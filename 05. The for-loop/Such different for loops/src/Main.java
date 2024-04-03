public class Main {
    public static void main(String[] args) {
        // Write your solution here
        for (int i = 0; i < 10; i++)
        {
            System.out.println(1);
        }

        int i = 0;
        for (; i < 10; ++i) {
            System.out.println(2);
        }

        for (int k = 10; k > 1; ) {
            k--;
            System.out.println(3);
        }

        for (; ; ) {
            System.out.println(4);
        }
    }
}