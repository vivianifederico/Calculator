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
    final static String ERR_VALUE_MIN = "MIN VALUE IS " ;
    final static String ERR_VALUE_MAX = "MAX VALUE IS " ;
    final static String ERR_VALUE_POSITIVE = "" ;
    final static String ERR_VALUE_BIG = "" ;
    final static String ERR_VALUE_NUMERIC = "" ;
    
    /*
    DOUBLE METHOD
    */
    
    public static double getDoubleNumber(String messaggio){
        System.out.println(messaggio);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();        
    }
    
    public static double getDoubleNumberNotNegative(String messaggio){
        Scanner in = new Scanner(System.in);
        double result ;
        do {
            result =  in.nextDouble();
            System.out.println(ERR_VALUE_NEGATIVE);
            
        }while (result < 0);
        
        return result;
        
    }
    
    public static double getDoubleNumberNotZero(String messaggio){
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
    public static int getIntNumber(String messaggio){
        Scanner in = new Scanner(System.in);
        return  in.nextInt();
    }
    
    public static int getIntNumberNotNegative(String messaggio){
        Scanner in = new Scanner(System.in);
        int result ;
        boolean ok = false;
        do {
            result =  in.nextInt();
            if (result < 0){
                System.out.println(ERR_VALUE_NEGATIVE);
            }else {
                ok = true;
            }
            
        }while (!ok);
        
        return result;
    }
    
    public static int getIntNumberNotZero(String messaggio){
        int result;
        Scanner in = new Scanner(System.in);
        boolean ok = false;
        do {
            result =  in.nextInt();
            if (result == 0){
                System.out.println(ERR_VALUE_ZERO);
            } else {
                ok = true;
            }
        }while (!ok);
        
        return result;
    }
    
    public static int getIntNumberMinMax(String messaggio, int min, int max ){
        Scanner in = new Scanner(System.in);
        int result ;
        boolean ok = false;
        do {
            System.out.println(messaggio);
            result =  in.nextInt();
            
            if (result < 0){
                System.out.println(ERR_VALUE_NEGATIVE);
            }else if (result < min){
                System.out.println(ERR_VALUE_MIN);
                
            }else if (result > max ){
                System.out.println(ERR_VALUE_MAX);
            }else {
                ok = true;
            }
            
        }while (!ok);
        
        return result;
    }
        
}