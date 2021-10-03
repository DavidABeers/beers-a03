/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {

    public String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a list of numbers, separated by spaces: ");
        return in.nextLine();
    }

    public int[] inputToArray(String input){
        // return the numbers in input as an array
        String[] splitNum = input.split(" ");
        int[] numbers = new int[splitNum.length];
        for(int i = 0;i< splitNum.length;i++){
            numbers[i] = Integer.parseInt(splitNum[i]);
        }
        return numbers;
    }
    public int[] filterEvenNumbers(int[] numbers){
        ArrayList<Integer> evens = new ArrayList<>();
        // get even numbers using the modulo operator
        for(int i = 0;i< numbers.length;i++){
            if(numbers[i]%2==0){
                evens.add(numbers[i]);
            }
        }
        int[] evenArray = new int[evens.size()];
        for(int i = 0;i< evenArray.length;i++){
            evenArray[i] = evens.get(i);
        }
        return evenArray;
    }

    // prints the array provided
    public void printArray(int[] array){
        System.out.print("The even numbers are ");
        for(int num : array){
            System.out.printf("%d ", num);
        }
    }

    public static void main(String[] args) {
        Solution38 s = new Solution38();
        String input = s.getUserInput();
        int[] original = s.inputToArray(input);
        int[] evens = s.filterEvenNumbers(original);
        s.printArray(evens);
    }
}
