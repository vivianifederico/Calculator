
package basiccalculator.util;

public class Operations implements MyMath {
    
    private final String ERR_VALUE_ZERO = "Errore, valore non corretto";
    
    private double firstNumber;
    private double secondNumber;
    
    Operations(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double moltiplicazione() {
        return this.firstNumber * this.secondNumber;
    }

    @Override
    public double divisione() {
        if (this.secondNumber == 0.0) {
            System.out.println(ERR_VALUE_ZERO);
            return 0.0;
        }
        return this.firstNumber / this.secondNumber;
    }
    

    @Override
    public double somma() {
        return this.firstNumber + this.secondNumber;
    }

    @Override
    public double differenza() {
        return this.firstNumber - this.secondNumber;
    }

    @Override
    public double logaritmo() {
        return Math.pow(this.firstNumber, this.secondNumber);
    }

    @Override
    public double potenza() {
        return Math.pow(this.firstNumber, this.secondNumber);
    }
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
    
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    public double getSecondNumber(){
        return this.secondNumber;
    }
}