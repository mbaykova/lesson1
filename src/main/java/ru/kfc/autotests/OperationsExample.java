package ru.kfc.autotests;

public class OperationsExample {

    public static void main(String[] args) {
        // + Сложение 2-х чисел
        int a = 10;
        int b = 7;
        int c = a + b;  // 17

        // - Вычитание
        int x = 10;
        int y = 7;
        int z = a - b;  // 3

        // * Умножение
        int a1 = 10;
        int b1 = 7;
        int c1 = a * b;  // 70

        // При делении стоит учитывать, что если в операции участвуют два целых числа,
        // то результат деления будет округляться до целого числа,
        // даже если результат присваивается переменной float или double
        double k = 10.0 / 4;     // 2.5
        System.out.println(k);

        //% - получение остатка от деления двух чисел:
        int a2 = 33;
        int b2 = 5;
        int c2 = a % b;  // 3

        // Инкремент
        int a3 = 8;
        int b3 = ++a;
        System.out.println(a3);  // 9
        System.out.println(b3);  //9

        int a4 = 8;
        int b4 = a4++;
        System.out.println(a4);  // 9
        System.out.println(b4);  // 8

        // Декремент
        int a5 = 8;
        int b5 = --a5;
        System.out.println(a5);  // 7
        System.out.println(b5);  // 7

        int a6 = 8;
        int b6 = a6--;
        System.out.println(a6);  // 7
        System.out.println(b6);  // 8
    }
}
