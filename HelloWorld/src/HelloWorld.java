import java.util.Scanner; // import of the Scanner class

public class HelloWorld {
    public static void main (String [] args) {
        String x = "Hello";
        String y = " World";
        System.out.println(x + y);
        int f = x.length();
        System.out.println("'Hello' contains of " + f + " letters");
        for(int i=1; i<=f; i++) {
            System.out.println(i);
            }
        for (int i = 0;i < x.length(); i++){
            int d = i + 1;
            System.out.println(d + " = " + x.charAt(i));
        }

        Scanner number1 = new Scanner(System.in);  // create new variable number1 in the Scanner class
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int n = number1.nextInt(); // assign the entered number to the variable n
        Scanner number2 = new Scanner(System.in); // create new variable number2 in the Scanner class
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int h = number2.nextInt(); // assign the entered number to the variable h
        int z = n + h;
        System.out.println("The sum of " + n + " + " + h + " = " + z);
        number1.close();
    }

}


