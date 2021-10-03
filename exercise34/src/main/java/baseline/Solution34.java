/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    // create and fill list.
    public ArrayList<String> giveEmployees(){
        ArrayList<String> employees = new ArrayList<>();
        employees.add(0, "John Smith");
        employees.add(1, "Jackie Jackson");
        employees.add(2, "Chris Jones");
        employees.add(3, "Amanda Cullen");
        employees.add(4, "Jeremy Goodwin");
        return employees;
    }

    // print out the list elements
    private void printList(ArrayList<String> employees){
        System.out.printf("There are %d employees%n%n", employees.size());
        for(String name:employees){
            System.out.println(name);
        }
    }

    // get name to remove
    private String getName(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter an employee to remove:");
        return in.nextLine();
    }

    // search list for element to remove
    public void removeEmployee(ArrayList<String> employees, String employee){
        for(int i = 0;i<employees.size();i++){
            if(employees.get(i).equals(employee)){
                employees.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Solution34 s = new Solution34();
        ArrayList<String> employees = s.giveEmployees();
        s.printList(employees);
        String employee = s.getName();
        s.removeEmployee(employees, employee);
        s.printList(employees);
    }
}
