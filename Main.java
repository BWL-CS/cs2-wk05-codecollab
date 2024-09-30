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

      System.out.println("Key phrase from Scroll 1: " + scroll1.substring(16, 32)); 
      System.out.println("Hidden warning in Scroll 2: " + scroll2.substring(12));

      System.out.println("Position of 'treasure' in Scroll 1: " + scroll1.indexOf("treasure"));
      System.out.println("Position of 'dragon' in Scroll 1: " + scroll1.indexOf("dragon"));

      System.out.println("Does Scroll 1 match the secret message?: " + scroll1.equals(secretMessage));
      System.out.println("Does Scroll 2 match the secret message?: " + scroll2.equals(secretMessage));

      System.out.println("Comparing Scroll 1 to Scroll 2: " + scroll1.compareTo(scroll2));
      System.out.println("Comparing Scroll 2 to Scroll 1: " + scroll2.compareTo(scroll1));

      // *** MATH CLASS METHODS ***
      System.out.println("--- MATH CLASS ---");

      double rand = Math.random();
      System.out.println("Here's a random number: " + rand);
      double biggerRand = Math.random() * 500 + 100;
      System.out.println("Here's a bigger random number: " + biggerRand);
      int randInt = (int) (Math.random() * 100 + 1);
      System.out.println("Here's a random whole number: " + randInt);

      double absoluteD = Math.abs(biggerRand);
      System.out.println("Absolute value of the random bigger number: " + absoluteD);

      int absoluteI = Math.abs(randInt);
      System.out.println("Absolute value of the random whole number: " + absoluteI);

      
   }
}
