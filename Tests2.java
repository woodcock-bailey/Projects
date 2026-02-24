
/**
 *
 * Author: Bailey Woodcock
 * Last Modified: February 23, 2026
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests2 {

   // The private fields!
   private double ave;
   private int count;
   private int score;

   // The default constructor!
   public Tests2() {
      ave = 0.0;
      count = 0;
      score = 0;
   }

   // The accessors for ave & count!
   public double getAve() {
      return ave;
   }

   public int getCount() {
      return count;
   }

   // The accessor & mutator for score!
   public int getScore() {
      return score;
   }

   public void setScore(int newScore) {
      score = newScore;
   }

   /**
    * 
    * This will prompt the user to enter test scores (-1 to quit),
    * then counts them, calculates the average, and stores
    * the results in the fields ave and count.
    * 
    */
   
   public void getAverage() {
      Scanner scnr = new Scanner(System.in);

      double sum = 0.0;
      int localCount = 0;

      System.out.print("Enter a test score (-1 to quit): ");
      int input = scnr.nextInt();   

      while (input != -1) {
         sum += input;
         localCount++;

         System.out.print("Enter a test score (-1 to quit): ");
         input = scnr.nextInt();
      }

      count = localCount;

      if (count > 0) {
         ave = sum / count;
      } else {
         ave = Double.NaN;
      }
   }

   @Override
   public String toString() {
      DecimalFormat df = new DecimalFormat("0.00");
      String avgString = (Double.isNaN(ave) ? "" : df.format(ave));
      return "The average of the " + count + " scores entered is " + avgString + ".";
   }
}