package ifTasks;

import java.util.Scanner;

public class IfTask3ShowHighestOutOfThree {
    public static void main (String [] args) {
        // Написать консольную программу, которая запрашивает у пользователя три целых числа и выводит на консоль наибольшее из них.
        // Если все числа равны то вывести на консоль текст "A == B == С".

        int numberInput1, numberInput2, numberInput3;
        Scanner number = new Scanner(System.in);
        System.out.println("Press right after the ':' symbol and enter three numbers (press 'Enter' after each number): ");

        numberInput1 = number.nextInt();
        numberInput2 = number.nextInt();
        numberInput3 = number.nextInt();


        if (numberInput1 > numberInput2 && numberInput1 > numberInput3) {
            System.out.println("Number " + numberInput1 + " is higher than " + numberInput2 + " and number " + numberInput3);
        }
        else if (numberInput2 > numberInput1 && numberInput2 > numberInput3) {
            System.out.println("Number " + numberInput2 + " is higher than " + numberInput1 + " and number " + numberInput3);
        }
        else if (numberInput3 > numberInput1 && numberInput3 > numberInput2) {
            System.out.println("Number " + numberInput3 + " is higher than " + numberInput1 + " and number " + numberInput2);
        }
        else {
            System.out.println(numberInput1 + " == " + numberInput2 + " == " + numberInput3);
        }
    }
}
