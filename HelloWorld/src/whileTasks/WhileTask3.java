package whileTasks;
import java.util.Random;
import java.util.Scanner;


public class WhileTask3 {
    public static void main (String [] args) {
        // Загадайка - загадывает
        //
        //1. Программа загадывает число от 1 до 100 случайным образом.
        //2. Пользователь вводит число. Программа отвечает, было ли это число больше,меньше или равно загаданному.
        //3. Если число не отгадано, переход к шагу 2.

        // get random number
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = 1;
        int numberInput = 0;

        //ask user to enter a number and if it is false - return to the beginning
        while (randomNumber != numberInput) {
            System.out.println("Enter one number: ");
            numberInput = input.nextInt();
            randomNumber = rand.nextInt(10) + 1;

            // compare numbers
            if (randomNumber > numberInput) {
                System.out.println("Our random number " + randomNumber + " is higher than your -> " + numberInput);
            }
            else if (randomNumber < numberInput) {
                System.out.println("Your number " + numberInput + " is higher than our random number -> " + randomNumber);
            }
            else {
                System.out.println("Our numbers are equal -> " + numberInput + " = " + randomNumber);
            }
        }

    }
}
