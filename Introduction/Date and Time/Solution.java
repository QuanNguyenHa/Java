/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;


import java.time.LocalDate;
import java.util.Scanner;


/**
 *
 * @author Quan
 */
public class Solution {

    /**
     * @param day
     * @param month
     * @param year
     * @return Date of the month
     */
    public static String getDay(String day, String month, String year) {
        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return date.getDayOfWeek().toString();
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }


}
