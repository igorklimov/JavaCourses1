package arrayTasks;

import java.util.Random;
import java.util.Scanner;

public class arrayTask2 {
    public static void main(String[] args) {
        // Tasks [2 - 7]

        int result = 0;
        int i;
        int tenRndNum[] = new int[10];
        int even = 0;
        int odd = 0;
        int max = 0;
        int x;
        int temp;
        int position = 0;
        int size = 10;
        int b;
        int rangeOfNumbers = 100;

        Random random = new Random();

        // get the values for array and detect oddness and evenness, highest number;

        for (i = 0; i < size; i++) {
            x = random.nextInt(rangeOfNumbers);
            tenRndNum[i] = x;
            if ((x % 2) == 0) {
                System.out.println("Even  " + x);
                even = even + 1;
            } else {
                System.out.println("Odd   " + x);
                odd = odd + 1;
            }
            if (x > max) {
                max = x;
            }
        }

        // get the position of numbers

        for (i = 0; i < size; i++) {
            for (i = 0; i < tenRndNum.length; i++) {
                if (max == tenRndNum[i]) {
                    position = i;
                    System.out.println("The position of max number is " + (i + 1));
                    System.out.println(" ");
                }
            }
        }

        // change the position of numbers

        temp = tenRndNum[0];
        tenRndNum[0] = max;
        tenRndNum[position] = temp;


        for (i = 0; i < size; i++) {
            System.out.println(" " + tenRndNum[i]);
            result = result + tenRndNum[i];
        }
        System.out.println(" ");

        // bubble sorting
        for (i = 1; i < size; i++)
            for (b = size - 1; b >= i; b--) {
                if (tenRndNum[b - 1] > tenRndNum[b]) {
                    temp = tenRndNum[b - 1];
                    tenRndNum[b - 1] = tenRndNum[b];
                    tenRndNum[b] = temp;
                }
            }

        for (i = 0; i < 10; i++) {
            System.out.println(" " + tenRndNum[i]);
            result = result + tenRndNum[i];
        }

        Scanner searchNum = new Scanner(System.in);
        System.out.println("Enter the number to search ");
        Integer userNum = searchNum.nextInt();

        // use method for binary search;
        int first = 0;
        int last = 10;

        binarySearch(tenRndNum, first, last, userNum);

        System.out.println(" ");
        System.out.println("Sum is = " + result);
        System.out.println("Number of even: " + even + " and number of odd: " + odd);
        System.out.println("The highest number is  " + max);
    }

    // Binary search method
    private static void binarySearch(int[] tenRndNumber, int first, int last, int userNum) {
        int position;

        position = (first + last) / 2;
        System.out.println("Middle element's position is " + position);

        while ((tenRndNumber[position] != userNum) && (first <= last)) {
            if (tenRndNumber[position] > userNum) {
                last = --position; // position - 1
            } else {
                first = ++position;    // position + 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(userNum + " is " + ++position + " number in array");

        } else {
            System.out.println("Error. Number is not found");
        }
    }
}