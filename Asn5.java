
/**
 * 
 * Description: simple program that shows how to use an arraylist class
 * Author: Bailey Woodcock
 * Last Date Modified: April 9, 2026
 * 
 */

import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        fruits.add("Strawberry");
        fruits.add("Honeydew");
        fruits.add("Mango");
        fruits.add("Pineapple");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Fruits ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Numbers ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        fruits.remove("Honeydew");
        fruits.add("Pear");

        numbers.remove(1);
        numbers.add(50);

        System.out.println();
        System.out.println("Fruits ArrayList after changes:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Numbers ArrayList after changes:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println();
        System.out.println("Size of fruits list: " + fruits.size());
        System.out.println("Size of numbers list: " + numbers.size());
    }
}