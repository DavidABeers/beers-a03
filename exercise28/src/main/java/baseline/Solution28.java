package baseline;

import java.util.Scanner;

public class Solution28 {

    // get input from user
    private int getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        return in.nextInt();
    }

    // loop the number prompt, add all values to the total
    public int computeTotal(){
        int total = 0;
        for(int i=0;i<5;i++){
            total+=this.getUserInput();
        }
        return total;
    }
    public static void main(String[] args){
        Solution28 sol = new Solution28();
        System.out.printf("The total is %d%n", sol.computeTotal());
    }
}
