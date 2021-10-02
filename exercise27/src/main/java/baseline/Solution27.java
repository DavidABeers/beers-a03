/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.ArrayList;

import java.util.Scanner;

public class Solution27 {
    String NO_ERROR = "no error";

    // get an input string from the user
    public String getUserInput(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.next();
    }

    private String validateLastName(String name){
        // return error statement if name is less than 2 characters or blank, otherwise return "no error"
        if(name.equals("")){
            return "Last name must be filled in\nLast name must be at least 2 characters%n";
        }
        if(name.length() < 2){
            return "Last name must be at least 2 characters";
        }
        return NO_ERROR;
    }

    private String validateFirstName(String name){
        // return error statement if name is less than 2 characters or blank, otherwise return "no error"
        if(name.equals("")){
            return "First name must be filled in\nLast name must be at least 2 characters%n";
        }
        if(name.length() < 2){
            return "First name must be at least 2 characters";
        }
        return NO_ERROR;
    }

    private String validateZip(String zip){
        // return error statement if zip isn't a 5-digit number, otherwise return "no error"
        if(zip.length()!=5){
            return "The zipcode must be a 5 digit number";
        }
        try {
            Integer.parseInt(zip);
        }
        catch (Exception e){
            return "The zipcode must be a 5 digit number";
        }
        return NO_ERROR;
    }

    private String validateID(String id){
        // return error statement if id isn't formatted as AA-1234, otherwise return "no error"
        String error = "The employee ID must be in the format AA-1234";
        if(id.length()!=7){
            return error;
        }
        for(int i = 0;i<2;i++){
            if(id.substring(i, i+1).toUpperCase().compareTo("A") < 0 || id.substring(i, i+1).toUpperCase().compareTo("Z") > 0){
                return error;
            }
        }
        if(id.substring(2, 3).compareTo("-")!=0){
            return error;
        }
        for(int i = 3; i<7;i++){
            if(id.substring(i, i+1).toUpperCase().compareTo("0") < 0 || id.substring(i, i+1).toUpperCase().compareTo("9") > 0){
                return error;
            }
        }
        return NO_ERROR;
    }

    public ArrayList<String> validateInput(String fName, String lName, String zip, String id){
        ArrayList<String> errors = new ArrayList<>();
        String name = this.validateFirstName(fName);
        String surname = this.validateLastName(lName);
        String zipcode = this.validateZip(zip);
        String employeeID = this.validateID(id);
        if(name.compareTo(NO_ERROR)!=0){
            errors.add(name);
        }
        if(surname.compareTo(NO_ERROR)!=0){
            errors.add(surname);
        }
        if(zipcode.compareTo(NO_ERROR)!=0){
            errors.add(zipcode);
        }
        if(employeeID.compareTo(NO_ERROR)!=0){
            errors.add(employeeID);
        }
        return errors;
    }

    private void printOutput(ArrayList<String> errors){
        // use size of errors to determine output format with switch, using elements in errors
        switch (errors.size()){
            case 1 -> System.out.printf("%s%n", errors.get(0));
            case 2 -> System.out.printf("%s%n%s%n", errors.get(0), errors.get(1));
            case 3 -> System.out.printf("%s%n%s%n%s", errors.get(0), errors.get(1), errors.get(2));
            case 4 -> System.out.printf("%s%n%s%n%s%n%s", errors.get(0), errors.get(1), errors.get(2), errors.get(3));
            default -> System.out.println("There were no errors");
        }
    }
    public static void main(String []args){
        Solution27 sol = new Solution27();
        String fName = sol.getUserInput("Enter the first name:");
        String lName = sol.getUserInput("Enter the last name:");
        String zip = sol.getUserInput("Enter the zipcode:");
        String id = sol.getUserInput("Enter the employee ID:");
        ArrayList<String> errors = sol.validateInput(fName, lName, zip, id);
        sol.printOutput(errors);
    }
}
