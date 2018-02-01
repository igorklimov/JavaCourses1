package HelloWorldTasks;

import java.util.Random;

public class RandomNumber {
    public static void main (String [] args) {
        int minNum = 0;
        int maxNum = 100;

        Random randomNumber = new Random();
        int result1 = randomNumber.nextInt((maxNum - minNum) + 1);
        int result2 = randomNumber.nextInt((maxNum - minNum) + 1);
        int result3 = randomNumber.nextInt((maxNum - minNum) + 1);

        System.out.println("Your random numbers are: " + result1 + " and " + result2 + " and " + result3 + ". The sum = " + (result1+result2+result3));
    }
}
