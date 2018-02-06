package arrayTasks;

import java.util.Random;

public class ArrayTask1 {
    public static void main(String[] args) {
        // Написать консольную программу, в которой нужно создать массив целых чисел длиной 10 элементов,
        // заполнить массив случайными числами и вывести его на консоль.

        int i;
        byte[] tenRndNum;

        Random random = new Random();
        tenRndNum = new byte[10];
        random.nextBytes(tenRndNum);
        for (i = 0; i <= tenRndNum.length; i++) {
            System.out.println(tenRndNum[i] * tenRndNum[i] + " "); // to exclude negatives
        }
    }
}
