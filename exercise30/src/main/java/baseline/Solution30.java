/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

public class Solution30 {

    // create and fill a  12 by 12 2D array
    public int[][] generateArray(){
        int[][] array = new int[12][12];
        // for i < 12
        //      for j < 12
        //          array[i][j] = (i+1) * (j+1)
        return array;
    }

    // output the array as a table
    public void printTable(int[][] array){
        // for i<12
        //      for j<12
        //          if num<10
        //              print "  num"
        //          if 9<num<100
        //              print " num"
        //          else print "num"
        //      print \n
    }
    public static void main(String[] args){
        Solution30 sol = new Solution30();
        int[][] array = sol.generateArray();
        sol.printTable(array);
    }
}
