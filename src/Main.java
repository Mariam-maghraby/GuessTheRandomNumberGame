package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max, min;
        max = 100;
        min = 1;
        int chosenNumber = (int) (Math.random()*(max-min+1))+min;

        System.out.format("I have randomly chosen number between[%d,%d]", min, max);
        System.out.println();
        System.out.println("Try to guess it!");
        Scanner scanner = new Scanner(System.in);

        int guessesLeft = 10;
        while (guessesLeft>0){
            System.out.format("You have %d guess(es) left:", guessesLeft);
            System.out.println();
            int inputNumber = scanner.nextInt();
            guessesLeft --;
            if(inputNumber > chosenNumber){
                System.out.println("It's smaller than "+ inputNumber);
            }
            else if(inputNumber < chosenNumber){
                System.out.println("It's greater than "+ inputNumber);
            }
            else {
                System.out.println("CORRECT.. YOU WON!!");
                return;
            }
        }
        if(guessesLeft == 0) {
            System.out.println("SORRY.. YOU LOST :(");
            System.out.println("The number was: "+ chosenNumber+ " SORRY!!");
        }

    }
}
