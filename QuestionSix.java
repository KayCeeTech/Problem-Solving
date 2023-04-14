package ProblemSolving;

import java.security.SecureRandom;
import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();

        int randomNumber = 1 + secureRandom.nextInt(10);
        System.out.println("Enter your Guess number: ");
        int userGuest = input.nextInt();

        while (userGuest != randomNumber) {
            if (userGuest >= randomNumber) {
                System.out.println("Incorrect Guess!");
            } else if (userGuest <= randomNumber) {
                System.out.println("Incorrect Guess!");
            }
            System.out.println("Guess a number from 1-10");
            userGuest = input.nextInt();
        }

        if (userGuest == randomNumber){
            System.out.println("Correct Guess");
        }
    }
}
