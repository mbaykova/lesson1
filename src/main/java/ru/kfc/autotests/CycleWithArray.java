package ru.kfc.autotests;

public class CycleWithArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 6};

        System.out.println("Элементы массива:" );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Все числа больше 4:" );
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 4) {
                System.out.println(array[i]);
            }
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 4) {
                count = count + 1;
            }
        }
        System.out.println("Количество чисел больше 4: " + count);

    }
}
