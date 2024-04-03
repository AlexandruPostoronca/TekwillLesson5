public class Main {
   public static void main(String[] args) {
      // Write your solution here
      for (int i = 0; i < 11; i++) {
         if (i % 2 != 0) {
            continue;
         }
         System.out.print(i + " ");
      }
   }
}