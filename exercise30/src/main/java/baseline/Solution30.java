/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Solution30 {

    // create and fill a  12 by 12 2D array
    public int[][] generateArray(){
        int[][] array = new int[12][12];
        for(int i = 0;i<12;i++){
            for(int j = 0;j<12;j++){
                array[i][j] = (i+1) * (j+1);
            }
        }
        return array;
    }

    // output the array as a table
    public void printTable(int[][] array){
        for(int i = 0;i<12;i++){
            for(int j = 0;j<12;j++){
                if(array[i][j] < 10){
                    System.out.printf("  %d ", array[i][j]);
                }
                else if(array[i][j] > 9 && array[i][j] < 100){
                    System.out.printf(" %d ", array[i][j]);
                }
                else{
                    System.out.printf("%d ", array[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Solution30 sol = new Solution30();
        int[][] array = sol.generateArray();
        sol.printTable(array);
    }
}
