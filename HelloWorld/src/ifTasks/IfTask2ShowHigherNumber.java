package ifTasks;

import java.util.Scanner;

public class IfTask2ShowHigherNumber {
    public static void main (String [] args) {
        // Task (can be changed a bit)
        // Написать консольную программу, которая запрашивает у пользователя два целых числа и выводит на консоль наибольшее из них.
        // Если числа равны то вывести на консоль текст "A == B".

        Scanner number = new Scanner(System.in);
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int numberInput1 = number.nextInt();
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int numberInput2 = number.nextInt();

        if (numberInput1 >= (numberInput2+1)) {
            System.out.println("Number " + numberInput1 + " is higher than " + numberInput2);
        }
        else if (numberInput1 == numberInput2) {
            System.out.println(numberInput1 + " == " + numberInput2);
        }
        else {
            System.out.println("Number " + numberInput1 + " is lower than " + numberInput2);
        }
    }
}
