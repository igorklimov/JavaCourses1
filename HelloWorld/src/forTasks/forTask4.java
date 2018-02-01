package forTasks;

import java.util.Scanner;

public class forTask4 {
    public static void main (String [] args) {
        // Написать консольную программу, которая запрашивает у пользователя два целых
        // числа и если первое число меньше второго то считает сумму целых чисел от первого до второго включительно.


        int number1, number2, sum = 0;
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        number1 = numberInput.nextInt();
        number2 = numberInput.nextInt();
        
        if (number1 < number2) {
            for(int i=number1; i<=number2; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Nope.");
        }

    }
}
