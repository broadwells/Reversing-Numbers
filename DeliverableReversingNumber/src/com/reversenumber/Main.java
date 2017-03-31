package com.reversenumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum = 0;
        boolean validAnswer = false;

        while (!validAnswer) {            // checking if userNum is a positive number to continue
            System.out.println("Please enter your number and press enter: ");
            userNum = scnr.nextInt();
            if (userNum < 0) {
                System.out.println("Sorry, that is not a valid number. Please try again.");
            }
            else {
                validAnswer = true;
            }
        }


        int reverseNum = reverse(userNum);
        System.out.println("The reversed number is " + reverseNum);
    }

    public static int reverse(int n) {   //reversing userNum
        int reverseNum = 0;
        int rem;    // rem = remainder of n

        //while loop is processing userNum and reversing the order the number to output reverseNum
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            reverseNum = reverseNum * 10 + rem;
        }
        return reverseNum;
    }
}
