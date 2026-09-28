/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.student.gamingconsoles;

import com.sun.source.tree.Tree;
import static com.sun.source.tree.Tree.Kind.SWITCH;
import java.util.Arrays;

/**
 *
 * @author Student
 */
public class GamingConsoles {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //declare & initialize single-dimesional array
   String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};
   
   //Declare & initialize two-dimensional array
   //Index 0 = PS5,XBOX,SWITCH
   double[][]gamingPrices = {
       {1000,2000,1500}, //PS5
       {2000,3000,1100},//XBOX
       {3000,4000,1200},//SWITCH
   };
   
   //Track the highest most sales difference
   String maxDifferencecities = "";
   double maxDifferenceAmount = 0;
   
   //Print report header
   System.out.println("========================");
   System.out.println(" GAMING CONSOLE REPORT ");
   System.out.println("=======================");
   System.out.printf("%-10s %-12s %-10s %-10s %-6s%n", "CITIES", "PS5","XBOX","SWTICH","DIFF", "RATING");
   System.out.println("============================");
        int i = 0;
   
   for(int 1 = 0; i < cities.length; i++){
        String cities = null.get(i);
        double PS5Price = gamingPrices [i] [0];
        double XBOXPrice = gamingPrices [i] [0];
        double SWITCHPrice = gamingPrices [i] [0];
            Tree.Kind PS5;
        //calculate
        double difference = PS5 - XBOX - SWITCH;
        
        // Check the difference is >= 2500 to assign stars
        String stars = " ";
        if (difference >= 2500){
            stars = "***";
        }
        
        //Display the formatted row dots
        System.out.printf("%-10s R%-11.of R%-9.of R%-9.of %-6%n", Arrays.toString(cities),PS5, XBOX,SWITCH,difference ,stars);
        
        //track cities with the greatest cost difference
        if (difference > maxDifferenceAmount){
            maxDifferenceAmount = difference;
            String name = null;
            maxDifferencecities = name;
        }
    }
   
   System.out.println("=================");
   
   //Dislay the city with the greatest cost difference
   System.out.println("City with the greatest cost difference: ");
   System.out.println(maxDifferencecities + " Difference :R" + String.format("%.of",maxDifferenceAmount) + ")");
   System.out.println("=============================");
           }
}