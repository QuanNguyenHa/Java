/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;
import java.util.*;
/**
 *
 * @author Quan
 */
public class Binary {
   public static String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        String [] ones = toBinary(n).split("0");
        //System.out.println(Arrays.toString(ones));
        System.out.println(ones.length);
        int max = 0;
        for(int i=0; i< ones.length; i++) {
            
            if(ones[i].length() > max) {
                max = ones[i].length(); 
            }
        }
        System.out.println(max);
        
    }
    
}
