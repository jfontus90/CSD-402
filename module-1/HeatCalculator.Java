import java.util.Scanner;

public class HeatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter water mass (kg): ");
        double waterMass = input.nextDouble();

        System.out.print("Enter initial temperature (C): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter final temperature (C): ");
        double finalTemp = input.nextDouble();

        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        System.out.println("Heat energy (Q) = " + Q + " Joules");
    }
}