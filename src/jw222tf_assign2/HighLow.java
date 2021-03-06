package jw222tf_assign2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Jorian on 13-11-2016 at 15:55.
 */
public class    HighLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //0-99 + 1 = 1-100.
        //The assignment is unclear though. 'Between 1-100' implies number 2 up to and including 99.
        int input, tries = 1, random = rand.nextInt(100) + 1;

        //A while loop is used, in order to have an if statement within counting the tries. If it's more than 10,
        //a message is printed. I was struggling with this a lot.
        while (true) {
            if (tries <= 10) {
                tries++;
                System.out.print("Please enter a number to check: ");
                input = sc.nextInt();
                if (input > random) {
                    System.out.println("lower");
                } else if (input < random) {
                    System.out.println("higher");
                } else {
                    System.out.println("The correct number is indeed: " + random + ". Guessed correctly after " + (tries - 1) + " tries!");
                    break;
                }
            } else {
                System.out.println("You failed to guess within 10 times.");
                break;
            }
        }
        sc.close();
    }
}

//Actually, a limit to 10 isn't needed. if the user is smart, he can always guess a number <= 100 within 10 tries.