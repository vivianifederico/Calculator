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
    
    final String ERR_VALUE_NEGATIVE = "" ;
    final String ERR_VALUE_ZERO = "" ;
    final String ERR_VALUE_LITTLE = "" ;
    final String ERR_VALUE_POSITIVE = "" ;
    final String ERR_VALUE_BIG = "" ;
    final String ERR_VALUE_NUMERIC = "" ;
    
    public static double getDoubleNumber(){
        Scanner in = new Scanner(System.in);
        return  in.nextDouble();
    }
    
}