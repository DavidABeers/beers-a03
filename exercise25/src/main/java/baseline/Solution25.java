/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 David Beers
 */

package baseline;

import java.util.Scanner;

public class Solution25 {

    // get password string from user
    public String getUserString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password:");
        return input.next();
    }

    // check if it's at least 8 characters
    private boolean isMinimumLength(String password){
        return (password.length()>=8);
    }

    //check the password for a number
    private boolean hasNumber(String password){
        for(int i = 0;i<password.length();i++){
            if(password.substring(i, (i+1)).compareTo("0")>=0 && password.substring(i, i+1).compareTo("9")<=0){
                return true;
            }
        }
        return false;
    }

    // check the password for a special character. Whoever decided numbers, uppers, and lowers should be separated on the
    // ascii table should be put in jail.
    private boolean hasSpecial(String password){
        for(int i = 0;i<password.length();i++){
            if(password.substring(i, (i+1)).compareTo("0")<0 ||
                (password.substring(i, i+1).compareTo("9")>0 && password.substring(i, i+1).compareTo("A")<0) ||
                (password.substring(i, i+1).compareTo("Z")>0 && password.substring(i, i+1).compareTo("a")<0) ||
                password.substring(i, i+1).compareTo("z")>0){
                return true;
            }
        }
        return false;
    }
    // evaluate the strength of the password based on criteria given
    public short passwordValidator(String password){
        // make int passwordStrength
        short passwordStrength = 0;
        if(this.isMinimumLength(password)) {
            if(this.hasNumber(password)){
                passwordStrength = 2;
            }
            if(this.hasSpecial(password)){
                passwordStrength = 3;
            }
        }
        else{
            try{
                Integer.parseInt(password);
            }
            catch(Exception e){
                passwordStrength = 1;
            }
        }
        return passwordStrength;
    }

    //use the indicated password strength to print the appropriate output
    private void outputPasswordStrength(short strength, String password){
        // switch case (0-3)
        // print "the password" +password+ "is a" + case + "password"
        switch (strength){
            case 1 ->System.out.printf("The password %s is a weak password", password);
            case 2 ->System.out.printf("The password %s is a strong password", password);
            case 3 ->System.out.printf("The password %s is a very strong password", password);
            default ->System.out.printf("The password %s is a very weak password", password);
        }
    }

    public static void main(String[] args){
        Solution25 sol = new Solution25();
        String password = sol.getUserString();
        short strength = sol.passwordValidator(password);
        sol.outputPasswordStrength(strength, password);
    }
}
