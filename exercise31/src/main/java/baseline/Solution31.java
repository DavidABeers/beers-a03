/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.Scanner;

public class Solution31 {


    // get user input
    public String getUserInput(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.next();
    }

    // make sure the user input is a number
    public short getCleanedInput(String prompt){
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

    // calculate target heart rate
    public short findTargetHR(short age, short hr, short intensity){
        // TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        double heartRate = ((220 - age) - hr) * ((double)intensity/100) + hr;
        return (short)heartRate;
    }

    // use findTargetHR to get values for each percentage in the table
    private void printTable(short age, short hr){
        System.out.printf("Resting Pulse: %d     Age: %d%n%n", hr, age);
        System.out.println("Intensity     | Rate\n--------------|-------");
        for(short i = 55;i<96;i+=5){
            System.out.println(i + "%           | " + this.findTargetHR(age, hr, i)+ " bpm");
        }
    }

    public static void main(String[] args){
        Solution31 s = new Solution31();
        // get age and resting heart rate
        short restingHR = s.getCleanedInput("Enter resting heart rate:");
        short age = s.getCleanedInput("Enter age:");
        s.printTable(age, restingHR);
    }

}
