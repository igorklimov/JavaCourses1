package whileTasks;
import java.util.Random;
import java.util.Scanner;

//Угадайка отгадывает
//
//1. Пользователь загадывает число от 1 до 100.
//2. Программа выводит число. Пользователь отвечает, было ли это число больше,меньше или равно загаданному.
//3. Если число не отгадано, переход к шагу 2.
//
//Возможны 2 реализации:
//1. Программа стремится сделать минимальное число ходов.
//
//2. Программа делает случайные ходы.
//
//В любом случае предполагаем, что пользователь не
// обманывает программу, т.е. если пользователь на число 50 ответил, что загаданное число больше,
// то программа не должна называть числа меньше 51.

public class WhileTask4 {
    public static void main (String[] args) {
        System.out.println("Please think of a number from 0 to 100");

        int min = 0;
        int max = 100;
        int machineNumber;

        Random randomNumber = new Random();
        machineNumber = randomNumber.nextInt(max - min) + min;
        System.out.println("I assume that your number is " + machineNumber);

        Scanner userResponse = new Scanner(System.in);
        String userAnswer = userResponse.nextLine();


        while (!userAnswer.contains(("equal").toLowerCase())) {

            if (userAnswer.contains(("higher").toLowerCase())) {
                min = machineNumber;
            }

            else if (userAnswer.contains(("lower").toLowerCase())) {
                max = machineNumber;
            }
            else {
                break;
            }

            machineNumber = randomNumber.nextInt(max - min) + min;
            System.out.println("I assume that your number is " + machineNumber + " min = " + min + " max = " + max);
            System.out.println("Is your number higher, lower or equal?");
            userAnswer = userResponse.nextLine();
        }
        System.out.println("Numbers are equal");
    }
}


