/**
 * Name: Jasmine Fontus
 * Course: CSD-402
 * Module: 5
 * Assignment: Locate Largest and Smallest in 2D Arrays
 * Description: This program finds the location (row and column)
 * of the largest and smallest values in 2D arrays of type
 * double and int.
 */
public class ArrayLocator {
/**
 * Finds the largest value in a double 2D array
 * and returns its location (row and column)
 */
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }
/**
 * Finds the largest value in an int 2D array
 * and returns its location (row and column)
 */
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }
/**
 * Finds the smallest value in a double 2D array
 * and returns its location (row and column)
 */
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0;
        int col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }
/**
 * Finds the smallest value in an int 2D array
 * and returns its location (row and column)
 */

    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0;
        int col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }

    public static void main(String[] args) {
        double[][] arr = {
            {1.5, 2.3, 3.1},
            {4.7, 0.2, 8.9}
        };

        int[] largest = locateLargest(arr);
        System.out.println("Largest at: [" + largest[0] + ", " + largest[1] + "]");

        int[] smallest = locateSmallest(arr);
        System.out.println("Smallest at: [" + smallest[0] + ", " + smallest[1] + "]");
    }
}