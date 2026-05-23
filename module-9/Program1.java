/**
 * Name: Jasmine Fontus
 * Course: CSD-402
 * Module: 9
 * Assignment: ArrayList Exception Handling
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        ArrayList<String> foods = new ArrayList<>();

        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pasta");
        foods.add("Tacos");
        foods.add("Chicken");
        foods.add("Rice");
        foods.add("Fries");
        foods.add("Salad");
        foods.add("Soup");
        foods.add("Ice Cream");

        System.out.println("Food List:");

        for (String food : foods) {
            System.out.println(food);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter an index number (0-9):");

        try {

            Integer index = input.nextInt();

            System.out.println("Selected Item: " + foods.get(index));

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Exception thrown: Out of Bounds");

        } catch (Exception e) {

            System.out.println("Invalid input.");

        }

        input.close();
    }
}