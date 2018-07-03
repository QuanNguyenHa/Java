/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.Scanner;

/**
 *
 * @author Quan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        int l = A.length() > B.length() ? B.length() : A.length();
	String str = "";
	for (int i = 0; i < l; i++) {
            if ((int) (A.toLowerCase()).charAt(i) > (int) (B.toLowerCase()).charAt(i)) {
		str = "Yes";
		break;
            } else if ((A.toLowerCase()).charAt(i) < (B.toLowerCase()).charAt(i)) {
		str = "No";
		break;
            }
	}
        if (str == "") {
            if (A.length() > B.length()) {
		str = "Yes";
            } else {
		str = "No";
            }
	}
        System.out.println(str);
	//https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int- 
	System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0)
				+ B.substring(1, B.length()));
		
    }
    
}
