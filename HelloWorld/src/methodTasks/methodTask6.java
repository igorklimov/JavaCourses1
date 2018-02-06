package methodTasks;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class methodTask6 {

    // Разбить на методы консольную программу, в которой нужно:
    //
    //1) создать массив целых чисел длиной 10 элементов
    //2) заполнить массив случайными числами
    //3) вывести его на консоль
    //4) найти в массиве наибольшее число и вывести его на консоль


    private static int[] tenRndNumbers;

    public static void main(String args[]) {
        gettingRandomNumbers();
        showHighestNumber();
        System.out.println("");

        showAllNumbers();

    }

    public static int randomize() {

        Random rand = new Random();
        int randomNum = rand.nextInt(1000);
        return randomNum;
    }

    public static int[] gettingRandomNumbers() {
        tenRndNumbers = new int[10];
        for (int i = 0; i < tenRndNumbers.length; i++) {
            tenRndNumbers[i] = randomize();
        }
        return tenRndNumbers;
    }

    public static void showHighestNumber() {
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (max < tenRndNumbers[i]) {
                max = tenRndNumbers[i];
            }
        }
        System.out.println("Max number is " + max);
    }

    public static void showAllNumbers() {
        for (int i = 0; i < 10; i++) {
            System.out.println(tenRndNumbers[i]);
        }
    }
}

