/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.Scanner;

public class Solution26 {

    //fetch input from the user for prompt
    public String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }

    // looking at the requirements I'm not really sure where this would actually be used.
    // could be implemented mid-calculation but the chances of it affecting the final value is basically zero
    public double roundToNextCent(double value){
        if((value*100)%100!=0){
            value = Math.ceil(value*100);
            value = value/100;
        }
        return value;
    }

    public static void main(String []args){
        Solution26 sol = new Solution26();
        PaymentCalculator pay = new PaymentCalculator();

        double balance = Double.parseDouble(sol.getUserInput("What is your balance?"));
        float apr = Float.parseFloat(sol.getUserInput("What is the APR on the card (as a percent)?"))/100;
        float monthlyPayment = Float.parseFloat(sol.getUserInput("What is your monthly payment?"));
        short months = pay.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
        System.out.printf("It will take you %d months to pay off this card%n", months);
    }

}
