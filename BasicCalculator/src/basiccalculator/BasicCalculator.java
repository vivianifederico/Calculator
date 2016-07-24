
package basiccalculator;

public class BasicCalculator extends Operations {
    static final String MESSAGE = "INSERISCI DUE OPERANDI";

    public BasicCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public boolean getResult(int Op) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("INSERISCI DUE OPERANDI");
        MyCalc calc = new MyCalc();
        calc.Init(calc);
             
    }
}
