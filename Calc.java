
/**
 * 
 * Description: Calc program that the Runner file will instantiate.
 * Author: Bailey Woodcock
 * Last Modified: March 9, 2026
 * 
 */

public class Calc {

    // The private data fields!
    private double num1;
    private double num2;

    // The setter methods!
    public void setNum1(double n1) {
        num1 = n1;
    }

    public void setNum2(double n2) {
        num2 = n2;
    }

    // The getter methods!
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
     // New safe input method!
    public double getValidNumber(String message) {
        String input;
        double value = 0;
        boolean valid = false;

        while (!valid) {
            input = JOptionPane.showInputDialog(message);

            try {
                value = Double.parseDouble(input);
                valid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
            }
        }

        return value;
    }

    // All of the math methods!
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // The toString method!
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}
