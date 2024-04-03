import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      Scanner scanner = new Scanner(System.in);

      long first= scanner.nextLong();
      long second= scanner.nextLong();

      long max = first > second ? first : second;

      //long max1 = first > second !? first : second;

      //long max2 = first : second ? first > second;

      long max3 = first > second ? second : first;

      long max4 = first < second ? second : first;

      System.out.println(max);
      System.out.println(max3);
      System.out.println(max4);
   }
}