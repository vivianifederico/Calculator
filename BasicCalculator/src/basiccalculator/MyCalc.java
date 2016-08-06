/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;

import basiccalculator.MyUtility.*;
/**
 *
 * @author feder
 */
public class MyCalc extends Operations {
    
    private final String ERR_OP_NOT_ALLOWED = "Errore, operazione non permessa";
    
    int choice;
    double result;
    final int EXIT;
    
    public MyCalc(){
        super(0,0);
        this.EXIT = 0;
        this.firstNumber  = MyUtility.getDoubleNumber(); 
        this.secondNumber = MyUtility.getDoubleNumber(); 
        this.choice = MyUtility.getIntNumber();
    } 
    
    public void Init(MyCalc calc){
        
        
        
        switch (this.choice) {
            case 1: {
                this.result = this.somma();
                printResult(this.result);
                break;
            }
            case 2: {
                calc.setResult(this.differenza()); 
                printResult(this.result);
                break;
            }
            case 3: {
                calc.setResult(this.moltiplicazione());
                printResult(this.result);
                break;
            }
            case 4: {
                calc.setResult(this.divisione());
                printResult(this.result);
                break;
            }
            case 0: {
                break;
            }
            default: {
                System.out.print(ERR_OP_NOT_ALLOWED);
            }
        }
        
    }
        
    public void printResult(double result){
        System.out.println(result);
    }
    
        
    public void setResult(double result ){
        this.result = result;
    } 
    
    public double getResult(){
        return this.result;
    }
}
