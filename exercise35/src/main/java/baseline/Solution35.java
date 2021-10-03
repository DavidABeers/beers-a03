/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {
    // get name from user
    public String getNameFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name: ");
        return in.nextLine();
    }
    // build arraylist of names
    private ArrayList<String> makeNameList(){
        ArrayList<String> names = new ArrayList<>();
        while(true){
            names.add(this.getNameFromUser());
            if(names.get(names.size()-1).equals("")){
                names.remove((names.size()-1));
                break;
            }
        }
        return names;
    }
    // print out the winner
    private void selectWinner(ArrayList<String> names){
        short i = (short)Math.round(Math.random()*names.size());
        System.out.printf("The winner is... %s!%n", names.get(i));
    }

    public static void main(String[] args) {
        Solution35 s = new Solution35();
        ArrayList<String> names = s.makeNameList();
        s.selectWinner(names);
    }
}
