/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.Locale;
import java.util.Scanner;

public class Solution24 {
    //get a string from the user
    String getUserString(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }
    // check that words are same length
    boolean isWordLengthIdentical(String word1, String word2){
        return word1.length()==word2.length();
    }

    // return an array of letter frequency in a string
    private int[] getLetterFrequency(String word){
        String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] wordCharacterFrequency = new int[26];
        for(int i = 0;i<word.length();i++) {
            for(int j = 0;j<26;j++){
                if(word.substring(i, i+1).toLowerCase(Locale.ROOT).equals(letters[j])){
                    wordCharacterFrequency[j] += 1;
                }
            }
        }
        return wordCharacterFrequency;
    }

    // check every character in word1 for a matching character in word2
    boolean isAnagram(String word1, String word2){
        if(!isWordLengthIdentical(word1, word2)){
            return false;
        }
        int[] firstWordCharacterFrequency = this.getLetterFrequency(word1);
        int[] secondWordCharacterFrequency = this.getLetterFrequency(word2);
        for(int i = 0; i<26;i++){
            if(firstWordCharacterFrequency[i] != secondWordCharacterFrequency[i]){
                return false;
            }
        }
        return  true;
    }
    // print the output based on whether isAnagram is true or false
    public void output(boolean isAnagram, String word1, String word2){
        if(isAnagram){
            System.out.printf("%s and %s are anagrams", word1, word2);
        }
        else{
            System.out.printf("%s and %s are not anagrams", word1, word2);
        }
    }
    public static void main(String []args){
        Solution24 sol = new Solution24();
        System.out.println("Enter 2 strings and I'll tell you if they are anagrams:");
        // ask user for the first word
        String word1 = sol.getUserString("Enter the first string:");
        // ask user for the second word
        String word2 = sol.getUserString("Enter the second string:");
        boolean anagram = sol.isAnagram(word1, word2);
        sol.output(anagram, word1, word2);
    }

}
