public class Main {

   public static void main(String []args) {

      // *** STRING CLASS METHODS ***
      System.out.println("--- STRING CLASS ---");

      String scroll1 = "The treasure lies beyond the mountains.";
      String scroll2 = "Beware of the dragon's lair!";
      String secretMessage = "The treasure lies beyond the mountains.";
      
      System.out.println("Scroll 1: " + scroll1);
      System.out.println(scroll1.length());
      System.out.println("Scroll 2: " + scroll2);
      System.out.println(scroll2.length());

      String keyPhrase = scroll1.substring(18, 38);
      String warning = scroll2.substring(14);
      System.out.println("Key phrase from Scroll 1: " + keyPhrase); 
      System.out.println("Hidden warning in Scroll 2: " + warning);

      int treasureIndex = scroll1.indexOf("treasure");
      int dragonIndex = scroll1.indexOf("dragon");
      System.out.println("Position of 'treasure' in Scroll 1: " + treasureIndex);
      System.out.println("Position of 'dragon' in Scroll 1: " + dragonIndex);

      System.out.println("Does Scroll 1 match the secret message?: " + scroll1.equals(secretMessage));
      System.out.println("Does Scroll 2 match the secret message?: " + scroll2.equals(secretMessage));

      System.out.println("Comparing Scroll 1 to Scroll 2: " + scroll1.compareTo(scroll2));
      System.out.println("Comparing Scroll 2 to Scroll 1: " + scroll2.compareTo(scroll1));

      // *** MATH CLASS METHODS ***
      System.out.println("\n--- MATH CLASS ---");

      // HINT: try running the program multiple times...
      double rand = Math.random();
      System.out.println("Here's a random number: " + rand);
      double biggerRand = Math.random() * 500;
      System.out.println("Here's a bigger random number: " + biggerRand);
      int randInt = (int) (Math.random() * 100 + 1);
      System.out.println("Here's a random whole number: " + randInt);

      double absoluteD = Math.abs(-3.14);
      System.out.println("Absolute value of -3.14 is: " + absoluteD);
      int absoluteI = Math.abs(-3);
      System.out.println("Absolute value of -3 is: " + absoluteI);

      double cubed = Math.pow(randInt, 3);
      System.out.println(randInt + " to the 3rd power is: " + cubed);

      double squareRoot = Math.sqrt(2500);
      System.out.println("Square root of 2500 is: " + squareRoot);

      
   }
}
