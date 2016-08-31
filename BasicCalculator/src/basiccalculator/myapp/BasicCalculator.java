
package basiccalculator.myapp;

import basiccalculator.util.InputException;
import basiccalculator.util.MyCalc;
import basiccalculator.util.MyMenu;
import basiccalculator.util.MyUtility;
import com.google.common.base.Strings;

public class BasicCalculator  {
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
    private static final String [] voci ={"AVVIA CALCOLATRICE"};

    public static void main(String[] args) throws InputException {
        
        MyCalc calc = new MyCalc();
        MyMenu mymenu = new MyMenu("WELCOME_MESSAGE",voci);
        
        do {
            mymenu.stampaMenu();
            
            System.out.println();    

            calc.setFirstNumber(MyUtility.getIntNumberMinMax(INSERT_MESSAGE,0,2));

            System.out.println(OPERATION_MESSAGE);
            System.out.println(SUM_MESSAGE);
            System.out.println(DIFF_MESSAGE);
            System.out.println(MULTI_MESSAGE);
            System.out.println(DIV_MESSAGE);
            System.out.println(POW_MESSAGE);
            System.out.println(LOG_MESSAGE);

            calc.SetOp(MyUtility.getIntNumberNotNegative(null)); 

            calc.setSecondNumber(MyUtility.getDoubleNumber(INSERT_MESSAGE));

            calc.Init();

            int lengthS = calc.toString().length();
            int lengthG = GRECA.length();

            System.out.println(GRECA);

            String myString = calc.toString();

            System.out.println(toString(myString,lengthS,lengthG));
            System.out.println(GRECA);
        } while (mymenu.scegli()!=0);
                
                     
    }
    
    public static String toString(String result, int lengthS, int lengthG ){
        
        int n = (lengthG - lengthS)/2;
               
        String left = Strings.padStart("", n, ' ');
        String right =Strings.padEnd("", n, ' ');
                        
        return left + result + right;
    }
    
    
}
