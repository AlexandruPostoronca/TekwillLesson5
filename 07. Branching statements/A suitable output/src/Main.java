public class Main {
   public static void main(String[] args) {
      // Write your solution here
      int n = 10;
      for (int i = 0; i < n; i++) {
         if (i * i < 36) {
            continue;
         }
         System.out.print(i + " ");
      }
   }
}