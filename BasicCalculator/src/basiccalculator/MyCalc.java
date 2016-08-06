/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;


/**
 *
 * @author feder
 */
public class MyCalc extends Operations {
    
    private final String ERR_OP_NOT_ALLOWED = "Errore, operazione non permessa";
    
    private int op;
    private double result;
    
    public MyCalc(){
        super(0,0);
        op = 0;
        result = 0;
    } 
    
    public void Init(){       
        
        switch (this.op) {
            case 1: {
                this.setResult(this.somma());
                break;
            }
            case 2: {
                this.setResult(this.differenza()); 
                break;
            }
            case 3: {
                this.setResult(this.moltiplicazione());
                break;
            }
            case 4: {
                this.setResult(this.divisione());
                break;
            }
            
            case 5:
                this.setResult(this.potenza());
                break;
            
            default: {
                System.out.print(ERR_OP_NOT_ALLOWED);
            }
        }
    }
            
    public void setResult(double result ){
        this.result = result;
    } 
    
    public double getResult(){
        return this.result;
    }
    
    public void SetOp (int op){
        this.op = op;
    }
    
    public int getOp(){
        return this.op;
    }
                
    public void toString ( int op, double result){
        System.out.println(" " +super.getFirstNumber() + " " + convertOpSymbol(op) + " " + super.getSecondNumber() +" " +"=" + " " + result);
    }
    
    private String convertOpSymbol(int op){
        String toString;
        
        switch (op){
            case 1: {
                toString = "+";
                break;
            }
            case 2: {
                toString = "-"; 
                break;
            }
            case 3: {
                toString = "*";
                break;
            }
            case 4: {
                toString = "/";
                break;
            }
           
            case 5: {
                toString = "^";
                break;
            }
            
            case 6: {
                toString = "log";
                break;
            }
           
            default: {
                toString = "";
            }
        }
        
        return toString;
    }
        
}