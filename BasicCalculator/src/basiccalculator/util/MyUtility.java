/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator.util;
import java.util.InputMismatchException;

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
    
    public static double getDoubleNumber(String messaggio) throws InputException{
        double value;
        
        System.out.println(messaggio);
        Scanner in = new Scanner(System.in);
        value = in.nextDouble(); 
        
        if (Double.isNaN(value)){
            throw new InputException("Not numeric data", value);
        }
        
        return value;        
                
    }
    
    public static double getDoubleNumberNotNegative(String messaggio) throws InputException { 
        Scanner in = new Scanner(System.in);
        double result ;
        do {
            result =  in.nextDouble();
            System.out.println(ERR_VALUE_NEGATIVE);
            
        }while (result < 0);
        
        if (Double.isNaN(result)){
            throw new InputException("Not numeric data", result);
        }
        return result;
        
    }
    
    public static double getDoubleNumberNotZero(String messaggio) throws InputException {
        Scanner in = new Scanner(System.in);
        double result ;
        do {
            result =  in.nextDouble();
            System.out.println(ERR_VALUE_ZERO);
            
        }while (result == 0);
        
        if (Double.isNaN(result)){
            throw new InputException("Not numeric data", result);
        }
        return result;
        
    }
    
    /*
        INT METHOD
    */
    public static int getIntNumber(String messaggio) throws InputException {
        
        double result;
        Scanner in = new Scanner(System.in);
        result = in.nextInt();
        
        if (Double.isNaN(result)){
            throw new InputException("Not numeric data", result);
        }
        
        return  (int)result;
    }
    
    public static int getIntNumberNotNegative(String messaggio) throws InputException {
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
    
    public static int getIntNumberNotZero(String messaggio) throws InputException {
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
    
    public static int getIntNumberMinMax(String messaggio, int min, int max ) throws InputException {
        Scanner in = new Scanner(System.in);
        int result = 0;
        boolean ok = false;
        do {
            System.out.println(messaggio);
            
            try {
                result =  in.nextInt();
            }catch (InputMismatchException e) {
                //System.out.println(e.getCause() + e.getMessage());
                throw new InputException("Not numeric data " , result);
            }
            
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