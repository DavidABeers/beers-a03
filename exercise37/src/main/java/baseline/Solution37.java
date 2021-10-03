/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution37 {
    // create lists of characters available for making a password
    // list special, list numeral, list alphabetical
    private List<Character> specials = new ArrayList<>();
    private List<Character> numerals = new ArrayList<>();
    private List<Character> letters = new ArrayList<>();

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
            specials.add((char)i);
        }
        for(int i = 58; i<65;i++){
            specials.add((char)i);
        }
        for(int i = 91; i<96;i++){
            specials.add((char)i);
        }
    }

    // get 3 shorts from user
    public short getInput(String prompt){
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        return in.nextShort();
    }

    // fill in numbers
    public int getEmptyIndex(ArrayList<Integer> filledIndexes, short length){
        int index = (int)(Math.random()*length);
        boolean matched = false;
        while(true){
            for(Integer i : filledIndexes){
                if(index==i){
                    matched = true;
                    break;
                }
            }
            if(!matched){
                filledIndexes.add(index);
                break;
            }
        }
        return index;
    }

   // build a password that fits the requirement
    public String generatePassword(short length, short numbers, short specialCharacters){
        // create character array for minimum length
        ArrayList<Integer> filledIndexes = new ArrayList<>();
        int index;
        char[] password = new char[length];
        // randomly place randomly-selected numerals
        while(numbers>1){
            index = this.getEmptyIndex(filledIndexes, length);
            password[index] = numerals.get((int) (Math.random() * numerals.size()));
            numbers--;
        }
        // randomly place randomly-selected special characters
        while(specialCharacters>1){
            index = this.getEmptyIndex(filledIndexes, length);
            password[index] = specials.get((int) (Math.random() * specials.size()));
            specialCharacters--;
        }
        // randomly place letters in remaining spots
        while(filledIndexes.size()<length-1){
            index = this.getEmptyIndex(filledIndexes, length);
            password[index] = letters.get((int) (Math.random() * letters.size()));
        }
        return String.valueOf(password);
    }

    public static void main(String[] args) {
        Solution37 s = new Solution37();
        s.fillLetters();
        s.fillNumerals();
        s.fillSpecials();
        short length = s.getInput("Enter minimum length: ");
        short characters = s.getInput("How many special characters? ");
        short numbers = s.getInput("How many numbers? ");
        System.out.printf("Your password is %s", s.generatePassword(length, numbers, characters));

    }

}
