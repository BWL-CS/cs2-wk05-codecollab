public class Main {

   public static void main(String []args) {

      // *** STRING CLASS METHODS ***
      String scroll1 = "The treasure lies beyond the mountains.";
      String scroll2 = "Beware of the dragon's lair!";
      String secretMessage = "The treasure lies beyond the mountains.";
      
      System.out.println("Scroll 1: " + scroll1.length() + " characters.");
      System.out.println("Scroll 2: " + scroll2.length() + " characters.");

      System.out.println("\nKey phrase from Scroll 1: " + scroll1.substring(16, 32)); 
      System.out.println("Hidden warning in Scroll 2: " + scroll2.substring(12));

      System.out.println("\nPosition of the word 'treasure' in Scroll 1: " + scroll1.indexOf("treasure"));
      System.out.println("\nPosition of the word 'dragon' in Scroll 1: " + scroll1.indexOf("dragon"));

      System.out.println("Do Scroll 1 and the secret message match?: " + scroll1.equals(secretMessage));
      System.out.println("Do Scroll 2 and the secret message match?: " + scroll2.equals(secretMessage));

      System.out.println("Result of comparing Scroll 1 to Scroll 2: " + scroll1.compareTo(scroll2));
      System.out.println("Result of comparing Scroll 2 to Scroll 1: " + scroll2.compareTo(scroll1));

      // *** MATH CLASS METHODS ***


   }
}
