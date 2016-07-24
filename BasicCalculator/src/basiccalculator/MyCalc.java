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
public class MyCalc extends Operations {
    
    int choice;
    double result;
    final int EXIT;
    
    public MyCalc(){
        super(0,0);
        this.EXIT = 0;
        this.result = result;
        this.firstNumber  = getDoubleNumber(); 
        this.secondNumber = getDoubleNumber(); 
        this.choice = getIntNumber();
    }
    
    //MyCalc calc = new MyCalc();
    
    
    public void Init(MyCalc calc){
               
        
        switch (this.choice) {
            case 1: {
                this.result = this.somma();
                printResult(this.result);
                break;
            }
            case 2: {
                this.result = this.differenza();
                printResult(this.result);
                break;
            }
            case 3: {
                this.result = this.moltiplicazione();
                printResult(this.result);
                break;
            }
            case 4: {
                this.result = this.divisione();
                printResult(this.result);
                break;
            }
            case 0: {
                break;
            }
            default: {
                System.out.print("Errore, operazione non permessa");
            }
        }
        
    }
    
    public double getDoubleNumber(){
        Scanner in = new Scanner(System.in);
        return  in.nextDouble();
    }
    
    public int getIntNumber(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public void printResult(double result){
        System.out.println(result);
    }
}
