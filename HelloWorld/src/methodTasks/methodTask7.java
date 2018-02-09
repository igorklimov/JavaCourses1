package methodTasks;

import java.util.Random;

public class methodTask7 {

//  1) создать массив целых чисел длиной 10 элементов
//  2) заполнить массив случайными числами
//  3) вывести его на консоль
//  4) отсортировать массив методом пузырьковой сортировки
//  5) вывести отсортированный массив на консоль

    private static int[] tenRndNumbers;


    public static void main(String[] args) {

        gettingRandomNumbers();
        showHighestNumber();

        System.out.println("");
        bubbleSorting();
        showAllNumbers();

    }

    public static int randomize() {

        Random rand = new Random();
        int randomNum = rand.nextInt(1000);
        return randomNum;
    }

    static void gettingRandomNumbers() {
        tenRndNumbers = new int[10];
        for (int i = 0; i < tenRndNumbers.length; i++) {
            tenRndNumbers[i] = randomize();
        }
    }

    public static void showHighestNumber() {
        int max = 0;
        for (int i = 0; i < tenRndNumbers.length; i++) {
            if (max < tenRndNumbers[i]) {
                max = tenRndNumbers[i];
            }
        }
        System.out.println("Max number is " + max);
    }

    public static void bubbleSorting() {
        int size = tenRndNumbers.length;
        for (int i = 0; i < size; i++) {
            for (int b = 1; b < (size - i); b++) {
                if (tenRndNumbers[b - 1] > tenRndNumbers[b]) {
                    int temp = tenRndNumbers[b - 1];
                    tenRndNumbers[b - 1] = tenRndNumbers[b];
                    tenRndNumbers[b] = temp;
                }
            }
        }
    }

    public static void showAllNumbers() {
        for (int i = 0; i < tenRndNumbers.length; i++) {
            System.out.println(tenRndNumbers[i]);
        }
    }

}
