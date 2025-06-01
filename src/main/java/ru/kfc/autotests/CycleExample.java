package ru.kfc.autotests;

public class CycleExample {

    public static void main(String[] args) {
        /*стандартный цикл for
            int i = 1 создает и инициализирует счетчик i
            i < 9  - условие, при котором будет выполняться цикл.
            В данном случае цикл будет выполняться, пока i не достигнет 9
            i++  -  приращение счетчика на единицу.
        */
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }

        /*
        Необязательно указывать все условия при объявлении цикла.
        Например, мы можем написать так:
         */
        int i = 1;
        for (; i < 9; ) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            i++;
        }


        int j = 7;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);


        int k = 6;
        while (k > 0){
            System.out.println(j);
            k--;
        }
    }
}
