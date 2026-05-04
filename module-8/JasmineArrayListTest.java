import java.util.ArrayList;
import java.util.Scanner;

/**
 * JasmineArrayListTest
 * This program collects integers from the user, stores them in an ArrayList,
 * and finds the largest value using a separate method.
 */
public class JasmineArrayListTest {

    /**
     * This method finds the largest integer in an ArrayList.
     * If the list is empty, it returns 0.
     *
     * @param list ArrayList of Integer values
     * @return largest Integer in the list, or 0 if empty
     */
    public static Integer max(ArrayList<Integer> list) {

        if (list == null || list.isEmpty()) {
            return 0;
        }

        int max = list.get(0);

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            int value = input.nextInt();

            numbers.add(value);

            if (value == 0) {
                break;
            }
        }

        int result = max(numbers);
        System.out.println("Largest value: " + result);
    }
}