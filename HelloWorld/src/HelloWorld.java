import java.util.Scanner;

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

        Scanner reader = new Scanner(System.in);  // assigns value from the input
        System.out.println("Press right after the ':' symbol and enter a number: ");
        int n = reader.nextInt(); // scans the next token of the input as an int.
        System.out.println("The number which you typed is: " + n);
        reader.close();


    }

}


