package ru.kfc.autotests;

public class SwitchExample {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        }

        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }


        if (num1 > num2) {
            System.out.println("Первое число больше второго");
        } else if (num1 < num2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }

        if(num1 > num2 && num1>7){
            System.out.println("Первое число больше второго и больше 7");
        }


        int num = 8;
        switch(num){

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;
                break;
            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");
        }
        //Изменения для Java 14
        int x = 2;
        switch (x) {
            case 1 -> System.out.println("Зеленый");
            case 2 -> System.out.println("Желтый");
            case 3 -> {
                System.out.println("Красный");
                System.out.println("Движение запрещено");
            }
            default -> System.out.println("Неправильно введено число");
        }


        //Добавлено ключевое слово yield для возврата результата
        int month = 4;
        String season = switch (month) {
            case 12, 1, 2:
                yield "Winter";
            case 3, 4, 5:
                yield "Spring";
            case 6, 7, 8:
                yield "Summer";
            case 9, 10, 11:
                yield "Autumn";
            default:
                yield "Not a Month";
        };
        System.out.println("April is in the " + season + ".");

    }
}
