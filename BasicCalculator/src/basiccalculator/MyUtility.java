/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class MyUtility {
    
    final static String ERR_VALUE_NEGATIVE = "NEGATIVE VALUE, NOT ALLOWED" ;
    final static String ERR_VALUE_ZERO = "ZERO VALUE, NOT ALLOWED" ;
    final static String ERR_VALUE_LITTLE = "" ;
    final static String ERR_VALUE_POSITIVE = "" ;
    final static String ERR_VALUE_BIG = "" ;
    final static String ERR_VALUE_NUMERIC = "" ;
    
    /*
    DOUBLE METHOD
    */
    
    public static double getDoubleNumber(){
        Scanner in = new Scanner(System.in);
        return in.nextDouble();        
    }
    
    public static double getDoubleNumberNotNegative(){
        Scanner in = new Scanner(System.in);
        double result ;
        do {
            result =  in.nextDouble();
            System.out.println(ERR_VALUE_NEGATIVE);
            
        }while (result < 0);
        
        return result;
        
    }
       
    
    public static double getDoubleNumberNotZero(){
        Scanner in = new Scanner(System.in);
        double result ;
        do {
            result =  in.nextDouble();
            System.out.println(ERR_VALUE_ZERO);
            
        }while (result == 0);
        
        return result;
        
    }
    
    /*
        INT METHOD
    */
    public static int getIntNumber(){
        Scanner in = new Scanner(System.in);
        return  in.nextInt();
    }
    
    public static int getIntNumberNotNegative(){
        Scanner in = new Scanner(System.in);
        int result ;
        do {
            result =  in.nextInt();
            System.out.println(ERR_VALUE_NEGATIVE);
            
        }while (result < 0);
        
        return result;
    }
    
    public static int getIntNumberNotZero(){
        Scanner in = new Scanner(System.in);
        int result ;
        do {
            result =  in.nextInt();
            System.out.println(ERR_VALUE_ZERO);
            
        }while (result == 0);
        
        return result;
    }
        
}