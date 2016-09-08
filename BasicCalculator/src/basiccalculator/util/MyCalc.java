/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator.util;


/**
 *
 * @author feder
 */
public class MyCalc extends Operations {
    
    private final String ERR_OP_NOT_ALLOWED = "Errore, operazione non permessa";
    
    private int op;
    private double result;
    private String[] operazioni;
    
    public MyCalc(){
        super(0,0);
        op = 0;
        result = 0;
        
    } 
    
    public MyCalc(String[] operazioni) throws IllegalArgumentException{
        this();
        this.operazioni = operazioni;
        
        if (operazioni.length == 0) 
            throw new IllegalArgumentException("Operazioni devono essere definite");
        stampaOperazioni();
    }
    
    public void Init(){       
        
        switch (this.op) {
            case 1: {
                this.setResult(somma());
                break;
            }
            case 2: {
                this.setResult(differenza()); 
                break;
            }
            case 3: {
                this.setResult(moltiplicazione());
                break;
            }
            case 4: {
                this.setResult(divisione());
                break;
            }
            
            case 5:
                this.setResult(potenza());
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
                
    @Override
    public String toString (){
        return " " +super.getFirstNumber() + " " + convertOpSymbol(getOp()) + " " 
                + super.getSecondNumber() +" " +"=" + " " + getResult();
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
        
    public void stampaOperazioni() {
        //System.out.println(titolo);
        //System.out.println(CORNICE);
        for (int i = 0; i < operazioni.length; i++) {
            System.out.println((i + 1) + "\t" + operazioni[i]);
        }
        System.out.println();
        //System.out.println(VOCE_USCITA);
        System.out.println();
    }
}