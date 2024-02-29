import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {1, 3, 9, 12};
        final int INSERT_VALUE = 5;
        for (int i: array) {
            System.out.println(i);
        }

        int position = Arrays.binarySearch(array, INSERT_VALUE);

        if (position < 0) {
            position = -position - 1;
            Integer[] newArray = new Integer[array.length + 1];
            newArray = Arrays.copyOfRange(array, 0, position);
            Integer[] newRightArray = new Integer[array.length - position];
            newRightArray = Arrays.copyOfRange(array, position, array.length);
            newArray[position] = INSERT_VALUE;
            newArray = Arrays.copyOfRange(newRightArray, 0, newRightArray.length);
            array = newArray;
        }

        for (int i : array) {
            System.out.println(i);
        }
//        System.out.println("\n" + Arrays.binarySearch(array, 5));
    }
}