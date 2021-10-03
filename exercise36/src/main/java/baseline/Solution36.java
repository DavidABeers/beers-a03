/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    // get a valid input from the user
    public String getInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        return in.nextLine();
    }

    // builds data from the inputs
    private ArrayList<String> buildDataSet(){
        ArrayList<String> data = new ArrayList<>();
        data.add(this.getInput());
        while(!(data.get(data.size()-1).equals("done"))){
            data.add(this.getInput());
            if(!(data.get(data.size()-1).equals("done"))){
                try{
                    Double.parseDouble(data.get(data.size()-1));
                }
                catch(Exception e){
                    data.remove(data.size()-1);
                }
            }
        }
        data.remove(data.size()-1);
        return data;
    }
    // gets the mean of the inputs
    public double average(ArrayList<String> data){
        double total = 0;
        for(String number : data){
            total += Double.parseDouble(number);
        }
        return total/data.size();
    }
    // gets the smallest of the input
    public double min(ArrayList<String> data){
        double minimum = Double.parseDouble(data.get(0));
        for(String number : data){
            if(Double.parseDouble(number)<minimum){
                minimum = Double.parseDouble(number);
            }
        }
        return minimum;
    }
    // gets the largest of the inputs
    public double max(ArrayList<String> data){
        double maximum = Double.parseDouble(data.get(0));
        for(String number : data){
            if(Double.parseDouble(number)>maximum){
                maximum = Double.parseDouble(number);
            }
        }
        return maximum;
    }
    // gets the standard deviation of the inputs
    public double std(ArrayList<String> data){
        double sum = 0;
        double mean = this.average(data);
        for(String number : data){
            sum += Math.pow(Double.parseDouble(number) - mean, 2);
        }
        return Math.sqrt(sum/(data.size()-1));
    }
    // prints stats on the list
    private void printStats(ArrayList<String> data){
        System.out.print("Numbers: ");
        for(String number:data){
            System.out.printf("%s, ", number);
        }
        System.out.printf("The average is %.2f%nThe minimum is %.2f%nThe maximum is %.2f%nThe standard deviation is %.2f%n", this.average(data), this.min(data), this.max(data), this.std(data));
    }

    public static void main(String[] args) {
        Solution36 s = new Solution36();
        ArrayList<String> data = s.buildDataSet();
        s.printStats(data);
    }
}
