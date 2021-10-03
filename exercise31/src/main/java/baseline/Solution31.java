/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.Scanner;

public class Solution31 {


    // get user input
    public String getUserInput(String prompt){

    }

    // make sure the user input is a number
    public short getCleanedInput(){
        // loop a try catch
    }

    // calculate target heart rate
    private short findTargetHR(short age, short hr, short intensity){
        // TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
    }

    // use findTargetHR to get values for each percentage in the table
    private void printTable(short age, short hr){
        // print table header
        // for i = 55;i<95;i+=5)
        //      print rows (i       | targetHR bpm)
    }

    public static void main(String[] args){
        Solution31 s = new Solution31();
        // get age and resting heart rate
        short restingHR = s.getCleanedInput();
        short age = s.getCleanedInput();
    }

}
