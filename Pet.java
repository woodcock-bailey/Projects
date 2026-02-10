
/**
 * 
 * Author: Bailey Woodcock
 * Description: 
 * Last Modified: February 9, 2026
 * 
 */

public class Pet {

   private String name;

   public Pet() {
      setName("Pet Name");
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public String getName() {
      return name;
   }

   public String toString() {
      String output = "";
      output += "Pet information:\n";
      output += "Name: " + name + "\n";
      return output;
   }

   // Main method!
   public static void main(String[] args) {

      // The first pet object
      Pet pet1 = new Pet();
      System.out.println(pet1.toString());

      // The second pet object
      Pet pet2 = new Pet();
      pet2.setName("Bingo");
      System.out.println(pet2.toString());
   }
}
