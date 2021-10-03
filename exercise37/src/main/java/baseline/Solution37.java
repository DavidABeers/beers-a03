/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution37 {
    // create lists of characters available for making a password
    // list special, list numeral, list alphabetical
    List<Character> specials = new ArrayList<>();
    List<Character> numerals = new ArrayList<>();
    List<Character> letters = new ArrayList<>();

    // fill the lists
    private void fillLetters(){
        for(int i = 97; i<123;i++){
            letters.add((char)i);
        }
    }
    private void fillNumerals(){
        for(int i = 48; i<58;i++){
            numerals.add((char)i);
        }
    }
    private void fillSpecials(){
        for(int i = 3; i<48;i++){
            letters.add((char)i);
        }
        for(int i = 58; i<65;i++){
            letters.add((char)i);
        }
        for(int i = 91; i<96;i++){
            letters.add((char)i);
        }
    }

    // get 3 shorts from user
    public short getInput(String prompt){

    }

   // build a password that fits the requirement
    public String generatePassword(short length, short numbers, short specialCharacters){
        // create character array for minimum length
        // randomly place randomly-selected numerals
        // randomly place randomly-selected special characters
        // randomly place letters in remaining spots
    }

    public static void main(String[] args) {
        Solution37 s = new Solution37();
        s.fillLetters();
        s.fillNumerals();
        s.fillSpecials();
        short length = s.getInput("Enter minimum length: ");
        short characters = s.getInput("How many special characters? ");
        short numbers = s.getInput("How many numbers?: ");
        System.out.printf("Your password is %s", s.generatePassword(length, numbers, characters));

    }

}
