public class Main {
   public static void main(String[] args) {
      // Write your solution here
      int howHungryAmI = 0; // 1 is stuffed, 10 is starving

      int numberOfHamburgersToEat = switch (howHungryAmI) {
         case 1, 2, 3 -> 0;
         case 4, 5, 6 -> 1;
         case 7, 8, 9 -> 2;
         case 10 -> 3;
      };
   }
}