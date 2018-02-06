package forTasks;

import java.util.Scanner;

public class ForTask3 {
    public static void main (String [] args) {
        // Написать консольную программу, которая запрашивает
        //у пользователя два целых числа и если певое число
        //меньше второго то программа выводит на консоль
        //все чётные числа от первого до второго числа.


        int number1, number2;
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        number1 = numberInput.nextInt();
        number2 = numberInput.nextInt();

        if (number1 < number2) {
            for(int i=number1; i<=number2; i++) {
                if ((i % 2) == 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Nope.");
        }

    }
}