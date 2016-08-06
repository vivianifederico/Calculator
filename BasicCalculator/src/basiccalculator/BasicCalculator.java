
package basiccalculator;

import com.google.common.base.Strings;

public class BasicCalculator extends Operations {
    private static final String WELCOME_MESSAGE = "BENVENUTI NELLA CALCOLATRICE";
    private static final String INSERT_MESSAGE = "INSERIRE L'OPERANDO ";
    private static final String OPERATION_MESSAGE = "OPERAZIONI DISPONIBILI :";
    private static final String SUM_MESSAGE = " (+) ->  1";
    private static final String DIFF_MESSAGE = " (-) ->  2";
    private static final String MULTI_MESSAGE = " (*) ->  3";
    private static final String DIV_MESSAGE = " (/) ->  4";
    private static final String POW_MESSAGE = " (^) ->  5";
    private static final String LOG_MESSAGE = " (log) ->  6";
    private static final String MESSAGE = "INSERISCI DUE OPERANDI";
    private static final String GRECA = "*--------------------------------------*";

    public BasicCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        MyCalc calc = new MyCalc();
        
        System.out.println(WELCOME_MESSAGE);        
        System.out.println(INSERT_MESSAGE);
        calc.setFirstNumber(MyUtility.getDoubleNumber());
        
        System.out.println(OPERATION_MESSAGE);
        System.out.println(SUM_MESSAGE);
        System.out.println(DIFF_MESSAGE);
        System.out.println(MULTI_MESSAGE);
        System.out.println(DIV_MESSAGE);
        System.out.println(POW_MESSAGE);
        System.out.println(LOG_MESSAGE);
        
        calc.SetOp(MyUtility.getIntNumberNotNegative()); 
        
        System.out.println(INSERT_MESSAGE);
        
        calc.setSecondNumber(MyUtility.getDoubleNumber());
        
        calc.Init();
        
        int lengthS = calc.toString().length();
        int lengthG = GRECA.length();
        
        
        
        System.out.println(GRECA);
        
        String myString = calc.toString();
        
        
        System.out.println(toString(myString,lengthS,lengthG));
        System.out.println(GRECA);
                
                     
    }
    
    
    public static String toString(String result, int lengthS, int lengthG ){
        
        int n = (lengthG - lengthS)/2;
               
        String left = Strings.padStart("", n, ' ');
        String right =Strings.padEnd("", n, ' ');
                        
        return left + result + right;
    }
    
    
}
