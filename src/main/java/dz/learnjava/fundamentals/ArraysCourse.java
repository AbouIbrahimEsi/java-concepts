package dz.learnjava.fundamentals;

import java.util.Arrays;

public class ArraysCourse {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[2] = 2;
//        numbers[10] = 2; // ==> generates an exception
        System.out.println(numbers);
        Arrays.toString(numbers); // multiple implementations ==> Method Overloading
        System.out.println(Arrays.toString(numbers));

        // Second way to initialize the array
        int[] numbers2 = {1,2,5,7,3}; // Arrays have a fix length ==> we can not remove or even add new items
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(numbers2);

        // Multi-dimensional Arrays
        int[][] matrix = new int[5][7];
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix)); // use this to print multidimensional arrays

        // Second way to initialize the array
        int[][] matrix2 = {{1,2,3} , {4,5,5}};
    }
}
