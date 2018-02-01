import java.util.Random;

public class RandomNumber {
    public static void main (String [] args) {
        int minNum = 0;
        int maxNum = 100;

        Random randomNumber = new Random();
        int result = randomNumber.nextInt((maxNum - minNum) + 1);

        System.out.println("Your random number is: " + result);
    }
}
