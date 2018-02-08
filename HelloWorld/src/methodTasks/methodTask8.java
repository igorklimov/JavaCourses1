package methodTasks;

import java.util.Random;

public class methodTask8 {

//    На бумаге написать метод на Java, который получает в качестве аргумента массив и разворачивает его задом наперед, т.е. первый элемент становится последним, второй  - предпоследним и т.д.
//    Результатом должен быть перевёрнутый массив, а не вывод элементов исходного в обратном порядке.
//    В качестве ответа сдать фотографию листочка с программой.
//    Запрограммировать Ваше решение в виде программы.


    private static int[] tenRndNumbers;

    public static void main(String[] args) {

        randomize();
        gettingRandomNumbers();
        System.out.println("Initial array");
        showAllNumbers();
        System.out.println(" ");
        System.out.println("Reversed array");
        revertArray();
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

    public static void showAllNumbers() {
        for (int i = 0; i < tenRndNumbers.length; i++) {
            System.out.println((i + 1) + " = " + tenRndNumbers[i]);
        }

    }

    public static void revertArray() {
        int size = tenRndNumbers.length;
        for (int i = 0; i < (size / 2); i++) {
            int reversedArrayTemporary = tenRndNumbers[i];
            tenRndNumbers[i] = tenRndNumbers[(size - i) - 1];
            tenRndNumbers[(size - i) - 1] = reversedArrayTemporary;
        }
    }
}


