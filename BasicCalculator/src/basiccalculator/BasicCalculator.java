
package basiccalculator;

public class BasicCalculator extends Operations {
    static final String MSG_WELCOME_MESSAGE = "INSERISCI DUE OPERANDI";

    public BasicCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public static void main(String[] args) {
        System.out.println(MSG_WELCOME_MESSAGE);
        MyCalc calc = new MyCalc();
        calc.Init(calc);
             
    }
}
