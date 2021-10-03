/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.Scanner;

public class Solution32 {
    // getUserInput
    public String getUserInput(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.next();
    }
    // check for numeric user input
    public short checkForNumericInput(String prompt){
        // loop a try catch
        short input = -1;
        while(input<=0){
            try{
                input = Short.parseShort(this.getUserInput(prompt));
            }
            catch (Exception e){
                System.out.println("Input must be a number.");
            }
        }
        return input;
    }
    // selects a number based on difficulty level
    public short getNumberWithDifficulty(short diff){
        short num;
        switch (diff){
            case 2 ->num = (short)Math.round(Math.random()*100);
            case 3 ->num = (short)Math.round(Math.random()*1000);
            default ->num = (short)Math.round(Math.random()*10);
        }
        return num;
    }
    // check if guess is lower or higher than the number
    private String checkHighOrLow(short num, short guess){
        if(num > guess){
            return "Too low! ";
        }
        else{
            return "Too high! ";
        }
    }

    public short playAgain(String answer){
        if(answer.equals("y")){
            return 1;
        }
        else {
            return 0;
        }
    }

    // loop for the game
    private void numberGuess(){
        short run = 1;
        while(run == 1){
            short guesses = 0;
            // the number that has to be guessed
            short number = this.getNumberWithDifficulty(checkForNumericInput("Select difficulty (1, 2, or 3)"));
            short guess = 0;
            while(guess!=number) {
                guess = this.checkForNumericInput("What's your guess?");
                guesses++;
                if (guess != number) {
                    System.out.print(this.checkHighOrLow(number, guess));
                }
                else{
                    System.out.printf("You got it in %d guesses!%n%n Would you like to play again?(y/n)", guesses);
                    run = this.playAgain(this.getUserInput(""));
                }
            }
        }


    }
    public static void main(String []args){
        System.out.println("Let's play guess the Number!");
        Solution32 s = new Solution32();
        s.numberGuess();
    }
}
