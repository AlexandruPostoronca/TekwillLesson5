public class Main {
   public static void main(String[] args) {
      // Write your solution here
      int counter = 0;
      boolean shouldBeStopped = false;

      while (!shouldBeStopped) {
         if (counter == 3) {
            shouldBeStopped = true;
         }
         counter++;
      }
      System.out.println(counter);
   }
}