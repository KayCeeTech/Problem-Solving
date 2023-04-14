package ProblemSolving;

import ClassPractice.ArrayOfEvenNumbers;

import java.util.Arrays;

public class QuestionFive {
    public static void main(String[] args) {


        int total = 0;
        for (int counter = 0; counter < 31; counter++){
            if (counter % 3 == 0) {
                total += counter;
            }
        }
        System.out.println();
        System.out.println("SUM:=>: "+ total);
    }



}
