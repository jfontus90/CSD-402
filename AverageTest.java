public class AverageTest {

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {

        short[] shortArr = {2, 4, 6};
        int[] intArr = {10, 20, 30, 40};
        long[] longArr = {100L, 200L, 300L};
        double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5};

        System.out.println("Short array:");
        printArray(shortArr);
        System.out.println("Average: " + average(shortArr));

        System.out.println("\nInt array:");
        printArray(intArr);
        System.out.println("Average: " + average(intArr));

        System.out.println("\nLong array:");
        printArray(longArr);
        System.out.println("Average: " + average(longArr));

        System.out.println("\nDouble array:");
        printArray(doubleArr);
        System.out.println("Average: " + average(doubleArr));
    }

    public static void printArray(short[] array) {
        for (short num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (long num : array) System.out.print(num + " ");
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double num : array) System.out.print(num + " ");
        System.out.println();
    }
}
