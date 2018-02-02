import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
         /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/

        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        
        /*
        scan.nextLine() returns everything after d2 till then beginning of the next line.
        Now Because there is no character after d2 until the beginning of the next line. It is going to return an empty string.
        => We need to add scan.nextLine(); in order to skip this empty string
        */

        scan.nextLine();
        
        s2 = scan.nextLine();
        
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+(int)i2);
        
        /* Print the sum of the double variables on a new line. */
		    System.out.println(d+(double)d2);
        
        /* Concatenate and print the String variables on a new line; 
        the 's' variable above should be printed first. */
        System.out.println(s+s2);
        
        scan.close();
    }
}
