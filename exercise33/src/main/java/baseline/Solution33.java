/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.Scanner;

public class Solution33 {
    // prompt for get a user's question
    public String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("What's your question?");
        return in.next();
    }

    // print a part of an array depending on a random number generated
    public short giveRandResponse(){
        String[] responses = {"Yes", "No", "Maybe", "Ask again later."};
        short i = (short)Math.round(Math.random()*4);
        System.out.println(responses[i]);
        return i;
    }
    public static void main(String []args){
        Solution33 s = new Solution33();
        s.getUserInput();
        s.giveRandResponse();
    }
}
