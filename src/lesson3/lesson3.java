package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class lesson3 {

    public static void main(String[] args) {

    invertArray();
    fillArray();
    changeArray();
    fillDiagonal();
    lenArray();

    }

    public static void invertArray () {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0};

        System.out.println("Размер массива arr равен индексу " + arr.length + "\tсо значениями:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.println("\nИзменим значения на обратные и выведем в консоль:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }

            System.out.print(arr[i] + " ");

        }

        System.out.println("\nПрограмма завершена\n\n");
    }

    public static void fillArray() {

        int[] fillArray = new int[100];

    for (int i = 0; i < fillArray.length; i++ ) {

        fillArray[i] = i; }

    System.out.println("Проверка 2-го задания:");
    System.out.println(Arrays.toString(fillArray));

    }

    public static void changeArray() {

        int[] less = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println("Проверка 3-го задания\n" + Arrays.toString(less));

        for (int i = 0; i < less.length; i++) {

         if (less[i] < 6) {

             less[i] = less[i] * 2; }

        }

        System.out.println(Arrays.toString(less));

    }

    public static void fillDiagonal() {

        System.out.println("Проверка 4-го задания:");

        int [] [] diagonal = new int [10] [10];

        for ( int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (i == j) {

                    diagonal[i][j] = 1;
                }
                System.out.print(diagonal[i][j] +" ");
            }

            System.out.println();
        }

    }

    public static void lenArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number:");

        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("Array size: " + arr.length);
        System.out.println("Input the value:");

        int initialValue = sc.nextInt();

        for ( int i =0; i < arr.length; i++) {

            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

}









