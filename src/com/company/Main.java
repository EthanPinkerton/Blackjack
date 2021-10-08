package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int computerNumber = random.nextInt(10)+1 + random.nextInt(10)+1;
        int playerNumber = random.nextInt(10)+1 + random.nextInt(10)+1;

        String userInput = "";
        while(userInput.equals("y")) {

            while (playerNumber <= 21 && !userInput.equals("n")) {
                System.out.println("Your number is " + playerNumber);
                System.out.print("Would you like another number? (y/n): ");
                userInput = input.next();
                if (userInput.equals("y")) {
                    playerNumber += random.nextInt(10) + 1;
                }
            }

            while (computerNumber < 17) {
                computerNumber += random.nextInt(10) + 1;
            }

            if (playerNumber > 21) {
                System.out.println("Your number is " + playerNumber);
                System.out.print("You're bust, you lose");
            } else if (computerNumber > 21) {
                System.out.println("The computers number is " + computerNumber);
                System.out.print("You win!!");
            } else {
                if (computerNumber > playerNumber) {
                    System.out.println("Your number is " + playerNumber);
                    System.out.println("The computers number is " + computerNumber);
                    System.out.print("You lose");
                } else if (computerNumber < playerNumber) {
                    System.out.println("Your number is " + playerNumber);
                    System.out.println("The computers number is " + computerNumber);
                    System.out.print("You win!!");
                } else {
                    System.out.println("Your number is " + playerNumber);
                    System.out.println("The computers number is " + computerNumber);
                    System.out.print("It's a draw!");
                }
            }

            System.out.print(" Would you like to play again? (y/n): ");
            userInput = input.next();
            if (userInput.equals("y")){
                computerNumber = random.nextInt(10)+1 + random.nextInt(10)+1;
                playerNumber = random.nextInt(10)+1 + random.nextInt(10)+1;
            }
        }
    }
}
