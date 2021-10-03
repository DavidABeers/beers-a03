/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

import java.util.*;

public class Solution40 {

    // generate list of maps
    public List<Map<Integer, Employee>> createMapsList(){
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

    // get user input string
    public String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a search string: ");
        return in.nextLine();
    }

    //output matching data in tabular format
    private void printMatchingDataAsTable(List<Map<Integer, Employee>> employees, String match){
        System.out.println("Results:\n\nName                  | Position           | Separation Date\n" +
                "----------------------|--------------------|----------------");
        for(int i = 0;i<employees.size();i++){
            String fName = employees.get(i).get(i).getFirstName();
            String lName = employees.get(i).get(i).getLastName();
            if(fName.toLowerCase().contains(match.toLowerCase()) || lName.toLowerCase().contains(match.toLowerCase())){
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
    }

    public static void main(String[] args) {
        Solution40 s = new Solution40();
        List<Map<Integer, Employee>> employees = s.createMapsList();
        String match = s.getUserInput();
        s.printMatchingDataAsTable(employees, match);
    }
}
