import java.util.Scanner;

public class forTask2 {
    public static void main (String [] args) {
        // Написать консольную программу, которая запрашивает у пользователя два числа.
        //
        //Если первое число меньше второго то при помощи цикла for
        //вывести на консоль числа от первого до второго.

        int number1, number2;
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        number1 = numberInput.nextInt();
        number2 = numberInput.nextInt();

        if (number1 < number2) {
            for(int i=number1; i<=number2; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Nope.");
        }
    }
}
