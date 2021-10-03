/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */
package baseline;

public class Employee {
    private String firstName = "";
    private String lastName = "";
    private String position = "";
    private String date = "";
    Employee(String fName, String lName, String job, String separation){
        firstName = fName;
        lastName = lName;
        position = job;
        date = separation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getDate() {
        return date;
    }
}
