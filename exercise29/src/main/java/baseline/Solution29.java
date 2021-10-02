package baseline;

import java.util.Scanner;

public class Solution29 {
    String invalid = "Sorry, that's not a valid input";

    // get user input
    public String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the rate of return?");
        return in.next();
    }

    // catch bad inputs in a loop
    public float checkInput(){
        // loop a check for 0 and a try catch for parseFloat
        float input = -1;
        while(input<=0){
            try{
                input = Float.parseFloat(this.getUserInput());
            }
            catch (Exception e){
                System.out.println(invalid);
            }
            if(input==0){
                System.out.println(invalid);
            }
        }
        return input;
    }

    public short calcTimeToDoubleInvestment(float rate){
        return (short) Math.ceil(72/rate);
    }

    public static void main(String[] args){
        Solution29 sol = new Solution29();
        float rate = sol.checkInput();
        System.out.printf("It will take %d years to double your initial investment.%n", sol.calcTimeToDoubleInvestment(rate));
    }
}
