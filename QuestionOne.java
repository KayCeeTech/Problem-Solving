package ProblemSolving;

import java.util.Scanner;

public class QuestionOne {

    public static int maximum(int number1, int number2, int number3){

        int maximumNumber = number1;

        if (number2 > maximumNumber){
            maximumNumber = number2;
        }
        if (number3 > maximumNumber){
            maximumNumber = number3;
        }
        return maximumNumber;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        double result = maximum(number1, number2, number3);
        System.out.printf("Maximum Number is: %.2f%n",result);

    }

}
