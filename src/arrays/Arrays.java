package arrays;

import java.util.Scanner;

/**
 *
 * @author tobio
 */
public class Arrays {

    public static void main(String[] args) {
        multiplyMatrices();
    }

    public static void findOne() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner console = new Scanner(System.in);

        System.out.println("Enter search key: ");
        int key = console.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at index " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found!");
    }

    public static void findLargestElement() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 7, 9, 10};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number in the array is " + max);
    }

    public static void secondLargestElement() {
        int arr[] = {1, 2, 3, 4, 5, 9, 7, 8, 6, 10};

        int max1 = 0, max2 = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            //if value is greater than max1, asssign to max1 and ignore check for max 2

            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("The second Largest number in the array is " + max2);

    }

    public static void leftShiftArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i + 1];
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void rightShiftArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                arr[i] = temp;
            } else {
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void insertInArray() {

        int[] arr = new int[10];

        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        int item = 15;

        int insertIndex = 2;

        for (int i = arr.length - 1; i >= insertIndex; i--) {

            if (i == insertIndex) {
                arr[i] = item;
            } else {
                arr[i] = arr[i - 1];
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void copyArray() {
        int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrB = new int[10];

        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = arrA[i];
        }

        System.out.println(java.util.Arrays.toString(arrB));
    }

    public static void reverseCopyArray() {
        int[] arrA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrB = new int[10];

        for (int i = arrA.length - 1; i >= 0; i--) {
            for (int j = 0; j < arrB.length - 1; i++) {
                arrB[j] = arrA[i];
            }
        }

        System.out.println(java.util.Arrays.toString(arrB));
    }

    public static void addMatrices() {
        int arrA[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int arrB[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int arrC[][] = new int[3][3];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrA[0].length; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        for (int x[] : arrC) {
            for (int y : x) {
                System.out.print(y + " ");
            }

            System.out.println("");
        }
    }

    public static void subMatrices() {
        int arrA[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int arrB[][] = {{1, 5, 2}, {6, 8, 4}, {3, 9, 7}};
        int arrC[][] = new int[3][3];

        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                arrC[i][j] = arrA[i][j] - arrB[i][j];
            }
        }

        for (int x[] : arrC) {
            for (int y : x) {
                System.out.print(y + " ");
            }

            System.out.println("");
        }
    }

    public static void multiplyMatrices() {
        int arrA[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int arrB[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int arrC[][] = new int[3][3];
//        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrC[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    arrC[i][j] = arrC[i][j] + arrA[i][k] * arrB[k][j];
                }
            }
        }

        for (int x[] : arrC) {
            for (int y : x) {
                System.out.print(y + " ");
            }

            System.out.println("");
        }
    }
}
