import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Scanner scanner = new Scanner(System.in);

      int a = scanner.nextInt();
      int b = scanner.nextInt();


      int max = a > b ? a : b;

      //int max1 = a : b ? a > b;

      //int max2 = a > b !? a : b;

      int max3 = a > b ? b : a;

      int max4 = a < b ? b : a;

      System.out.println(max);
      System.out.println(max3);
      System.out.println(max4);
   }
}