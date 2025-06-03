package ru.kfc.autotests;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        int[] array2 = new int[5]; // создали массив под 5 элементов

        int x = array[0] + array[2]; // x = 4

        // теперь массив array содержит элементы 1, 5 и 3
        array[1] = 5;
        System.out.println(Arrays.toString(array));

        int y = array[0] + array[1]; // y = 8
        System.out.println(y);
        array[2] = null; // можно записать пустое значение

        for (Integer integer : array) {
            System.out.println(integer);
        }

        Integer[] array3 = {1, 2, 3};
      //  int z = array3[3];

        int intArray[] = {0, 1};

        String[] strArray = {"Summer", "Winter"};

        int multiArray[][] = {{0, 1}, {3, 4}};

        //Многомерный массив
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "Potter"},
        };

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j] + names[i + 1][j]);
            }
        }


    }
}
