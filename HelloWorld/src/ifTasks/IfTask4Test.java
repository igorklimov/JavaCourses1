package ifTasks;

import java.util.Scanner;

public class IfTask4Test {
    public static void main(String[] args) {

        // get numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press right after the ':' symbol and enter 3 numbers: ");
        int aInput = scanner.nextInt();
        int bInput = scanner.nextInt();
        int cInput = scanner.nextInt();

        // calculate Discriminant

        IfTask4Quadratic Discriminant = new IfTask4Quadratic(aInput, bInput, cInput);
        int D = Discriminant.calculateDiscriminant();
        System.out.println("Discriminant is " + D);


        // calculate squares

        if (D > 0) {
            double x1, x2;
            x1 = (-bInput - Math.sqrt(D)) / (2 * aInput);
            x2 = (-bInput + Math.sqrt(D)) / (2 * aInput);
            System.out.println("Squares are: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -bInput / (2 * aInput);
            System.out.println("The only square is : x = " + x);
        } else {
            System.out.println("No squares!");
        }
    }
}