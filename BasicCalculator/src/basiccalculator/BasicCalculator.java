
package basiccalculator;

import java.util.Scanner;

public class BasicCalculator extends Operations {
    final static String WELCOME_MESSAGE = "BENVENUTI NELLA CALCOLATRICE";
    final static String INSERT_MESSAGE = "INSERIRE L'OPERANDO ";
    final static String OPERATION_MESSAGE = "OPERAZIONI DISPONIBILI :";
    final static String SUM_MESSAGE = " (+) ->  1";
    final static String DIFF_MESSAGE = " (-) ->  2";
    final static String MULTI_MESSAGE = " (*) ->  3";
    final static String DIV_MESSAGE = " (/) ->  4";
    final static String POW_MESSAGE = " (^) ->  5";
    final static String MESSAGE = "INSERISCI DUE OPERANDI";

    public BasicCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public boolean getResult(int Op) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
        
        MyCalc calc = new MyCalc();
        
        System.out.println(INSERT_MESSAGE);
        calc.firstNumber = calc.getDoubleNumber();
        System.out.println(INSERT_MESSAGE);
        calc.secondNumber = calc.getDoubleNumber();
        
        System.out.println(OPERATION_MESSAGE);
        System.out.println(SUM_MESSAGE);
        System.out.println(DIFF_MESSAGE);
        System.out.println(MULTI_MESSAGE);
        System.out.println(DIV_MESSAGE);
        System.out.println(POW_MESSAGE);
        
        calc.choice = calc.getIntNumber();
        
        calc.Init(calc);
             
    }
    
   
    
    /*public void spamSomething(String MESSAGE){
        System.out.println(MESSAGE);
    }*/
}
