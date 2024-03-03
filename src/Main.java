import java.util.Arrays;

public class Main {
    final static  int MAX_SIZE = 5;
    static Integer[] array = new Integer[MAX_SIZE];
    static int size = 0;
    static int insertValue;

    public static void main(String[] args) {
        Arrays.fill(array, null);
        insert(2);
        insert(5);
        insert(8);
        insert(1);
        insert(0);

//        for (int i: array) {
//            System.out.println(i);
//        }
//        System.out.println("qwe".compareTo("asd"));
//        System.out.println(Arrays.binarySearch(array, INSERT_VALUE)); // int position = Arrays.binarySearch(array, INSERT_VALUE);

//        if (position < 0) {
//            position = -position - 1;
//            Integer[] newArray = new Integer[array.length + 1];
//            newArray = Arrays.copyOfRange(array, 0, position);
//            Integer[] newRightArray = new Integer[array.length - position];
//            newRightArray = Arrays.copyOfRange(array, position, array.length);
//            newArray[position] = INSERT_VALUE;
//            newArray = Arrays.copyOfRange(newRightArray, 0, newRightArray.length);
//            array = newArray;
//        }
//
//        for (int i : array) {
//            System.out.println(i);
//        }
//        System.out.println("\n" + Arrays.binarySearch(array, 5));
    }

    static void insert(int insertValue) {
        if (size != 0) {
            int position = Arrays.binarySearch(array, 0, size, insertValue);
            position = - position - 1;
            System.arraycopy(array, position, array, position + 1, size - position);
            array[position] = insertValue;
        } else {
            array[0] = insertValue;
        }
        size++;
    }
}