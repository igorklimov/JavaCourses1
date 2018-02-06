package ifTasks;

import java.util.Scanner;

public class IfTask1CompareNumber {
    public static void main (String [] args) {
        // Task:
        // Запросите у пользователя целое число:
        // - если оно меньше 0 - вывести сообщение: Число отрицательное
        // - если число равно 0 - вывести сообщение: Число равно 0
        // - если число больше 0 - вывести сообщение: Число положительное

        Scanner number = new Scanner(System.in);
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int numberInput = number.nextInt();

        if (numberInput >= 1) {
            System.out.println(numberInput + " is higher than 0" );
        }
        else if (numberInput == 0) {
            System.out.println(numberInput + " is equal to 0");
        }
        else {
            System.out.println(numberInput + " is less than 0");
        }
    }
}
