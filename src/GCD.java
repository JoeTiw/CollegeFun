import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int numDigits; //number of digits
        System.out.println("Enter the number of digits: "); //prompt the user to enter the number of digits
        Scanner sc = new Scanner(System.in); //create a scanner object
        numDigits = sc.nextInt(); //store the number of digits in a variable called numDigits

        int num1 = generateRandomNumber(numDigits); //generate a random number with the number of digits the user entered
        int num2 = generateRandomNumber(numDigits); //generate a random number with the number of digits the user entered

        System.out.println("The first random number: " + num1); //print the first random number
        System.out.println("The second random number: " + num2); //print the second random number

        //start the timer
        long start = System.nanoTime();
        int result = gcd(num1, num2); //call the gcd method
        long end = System.nanoTime();
        long time_taken = end - start;

        System.out.println("The gcd is: " + result);
        System.out.println("Total amount of time for function gcd(" + num1 + ", " + num2 + "): " + time_taken + " nanoseconds");
    }

    private static int generateRandomNumber(int numDigits) {
        Random rand = new Random(); //create a random object
        //generate a random number with the number of digits the user entered
        return rand.nextInt((int) Math.pow(10, numDigits) - 1) + (int) Math.pow(10, numDigits - 1);

    }

    private static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}


