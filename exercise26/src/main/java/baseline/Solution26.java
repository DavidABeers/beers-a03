/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

public class Solution26 {

    //fetch input from the user for prompt
    public String getUserInput(String prompt){

    }

    // looking at the requirements I'm not really sure where this would actually be used.
    // could be implemented mid-calculation but the chances of it affecting the final value is basically zero
    public float roundToNextCent(float value){
        //multiply value by 100 and use modulo to determine if 1 should be added
        //divide by 100 for rounded number and return
    }

    public static void main(String []args){
        Solution26 sol = new Solution26();
        PaymentCalculator pay = new PaymentCalculator();

        double balance = Double.parseDouble(sol.getUserInput("What is your balance?"));
        float apr = Float.parseFloat(sol.getUserInput("What is the APR on the card (as a percent)?"))/100;
        float monthlyPayment = Float.parseFloat(sol.getUserInput("What is your monthly payment?"));
        short month = pay.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
    }

}
