package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        int guesses = 0;
        boolean correct = false;
        System.out.println(number);
        while(!correct) {
            System.out.println("Guess the number between 0 and 99");
            int guess = input.nextInt();
            guesses++;
            if(guess == number) {
                System.out.println("You guessed the correct number. It took you " + guesses + " guesses");
                correct = true;
            } else if((guess <= number + 5 && guess >= number) || (guess >= number - 5 && guess <= number)) {
                System.out.println("Hot");
            } else if((guess <= number + 10 && guess >= number) || (guess >= number - 10 && guess <= number)) {
                System.out.println("Warm");
            } else {
                System.out.println("Cold");
            }
        }
    }
}
