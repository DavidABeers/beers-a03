/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution39 {

    // make a list of maps that include a last name and employee object
    public List<Map<Integer, Employee>> makeMapList(){
        List<Map<Integer, Employee>> employees = new ArrayList<>();
        Map<Integer, Employee> employ1  = new HashMap<>();
        Map<Integer, Employee> employ2  = new HashMap<>();
        Map<Integer, Employee> employ3  = new HashMap<>();
        Map<Integer, Employee> employ4  = new HashMap<>();
        Map<Integer, Employee> employ5  = new HashMap<>();
        Map<Integer, Employee> employ6  = new HashMap<>();
        Employee employee1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        Employee employee2 = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Employee employee3 = new Employee("Micheala", "Michaelson", "District Manager", "2-15-12-19");
        Employee employee4 = new Employee("Jake", "Jacobson","Programmer", "");
        Employee employee5 = new Employee("Jacquelyn", "Jackson","DBA", "");
        Employee employee6 = new Employee("Sally", "Webber","Web Developer", "2015-12-18");
        employ1.put(0, employee1);
        employ2.put(1, employee2);
        employ3.put(2, employee3);
        employ4.put(3, employee4);
        employ5.put(4, employee5);
        employ6.put(5, employee6);
        employees.add(employ1);
        employees.add(employ2);
        employees.add(employ3);
        employees.add(employ4);
        employees.add(employ5);
        employees.add(employ6);
        return employees;
    }

    // use string values to sort list by last name
    public List<Map<Integer, Employee>> sortMapList(List<Map<Integer, Employee>> employees){
        for(int i = 0; i< employees.size()-1;i++){
            String name1 = employees.get(i).get(i).getLastName();
            String name2 = employees.get(i+1).get(i+1).getLastName();
            if(name1.toLowerCase().compareTo(name2.toLowerCase())>0){
                Employee temp = employees.get(i+1).get(i+1);
                employees.get(i+1).replace(i+1, employees.get(i).get(i));
                employees.get(i).replace(i, temp);
                i = 0;
            }
        }
        return employees;
    }

    // print the list data as a table
    private void tabularPrint(List<Map<Integer, Employee>> employees){
        System.out.println("Name                  | Position           | Separation Date\n" +
                            "----------------------|--------------------|----------------");
        for(int i = 0;i<employees.size();i++){//22 chars
            String fName = employees.get(i).get(i).getFirstName();
            String lName = employees.get(i).get(i).getLastName();
            String position = employees.get(i).get(i).getPosition();
            String date = employees.get(i).get(i).getDate();
            System.out.print(fName + " " + lName);
            for(int j = fName.length() + lName.length(); j< 21;j++){
                System.out.print(" ");
            }
            System.out.print("| " + position);
            for(int j = position.length();j<19;j++){
                System.out.print(" ");
            }
            System.out.println("| " + date);
        }
    }

    public static void main(String[] args) {
        Solution39 s = new Solution39();
        List<Map<Integer, Employee>> employees = s.makeMapList();
        employees = s.sortMapList(employees);
        s.tabularPrint(employees);
    }
}
