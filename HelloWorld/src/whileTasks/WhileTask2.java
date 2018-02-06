package whileTasks;

import java.util.Scanner;

public class WhileTask2 {
    public static void main(String[] args) {

        // Написать консольную программу, которая запрашивает у пользователя два числа.
        // Если первое число меньше второго то при помощи цикла while
        // вывести на консоль числа от первого до второго.

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int number1 = numberInput.nextInt();
        int number2 = numberInput.nextInt();

        if (number1 < number2) {
            while (number1 <= number2) {
                System.out.println(number1);
                number1++;
            }
        }

    }
}
