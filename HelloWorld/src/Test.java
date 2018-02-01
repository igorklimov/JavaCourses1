import java.util.Scanner;

public class Test{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int aInput = a.nextInt(); // assign the entered number to the variable n

        Scanner b = new Scanner(System.in);  // create new variable number1 in the Scanner class
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int bInput = b.nextInt(); // assign the entered number to the variable n

        Scanner c = new Scanner(System.in);  // create new variable number1 in the Scanner class
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int cInput = c.nextInt(); // assign the entered number to the variable n

        Quadratic Discriminant = new Quadratic(aInput, bInput, cInput);
        int D = Discriminant.calculateDiscriminant();
        System.out.println("Discriminant is " + D);

        if (D > 0) {
            double x1, x2;
            x1 = (-bInput - Math.sqrt(D)) / (2 * aInput);
            x2 = (-bInput + Math.sqrt(D)) / (2 * aInput);
            System.out.println("Squares are: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -bInput / (2 * aInput);
            System.out.println("The only square is : x = " + x);
        }
        else {
            System.out.println("No squares!");
        }
    }
}