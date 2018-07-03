/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Quan
 */
public class Solution {

  public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> subString = new ArrayList();
        for (int i = 0; i <= s.length()-k; i++){
            System.out.println(s.substring(i, i+k));
            subString.add(s.substring(i, i+k));
        }
        Collections.sort(subString);
        /*
        for(String item: subString){
            System.out.println(item);
        }
        */
        smallest = subString.get(0);
        largest = subString.get(subString.size()-1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
