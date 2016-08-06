
package basiccalculator;

public class Operations implements MyMath {
    
    private final String ERR_VALUE_ZERO = "Errore, valore non corretto";
    
    double firstNumber;
    double secondNumber;
    
    public Operations(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double moltiplicazione() {
        return this.firstNumber * this.secondNumber;
    }

    public double divisione() {
        if (this.secondNumber == 0.0) {
            System.out.println(ERR_VALUE_ZERO);
            return 0.0;
        }
        return this.firstNumber / this.secondNumber;
    }
    

    public double somma() {
        return this.firstNumber + this.secondNumber;
    }

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
    
}