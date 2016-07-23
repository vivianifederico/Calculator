
package basiccalculator;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class BasicCalculator extends Operations {
    static final String MESSAGE = "INSERISCI DUE OPERANDI";

    public BasicCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    public boolean getResult(int Op) {
        return false;
    }

    public static void main(String[] args) {
        double result = 0.0;
        System.out.println("INSERISCI DUE OPERANDI");
        Scanner in = new Scanner(System.in);
        double FirstNumber = in.nextDouble();
        double SecondNumber = in.nextDouble();
        int Choice = in.nextInt();
        BasicCalculator Calc = new BasicCalculator(FirstNumber, SecondNumber);
        switch (Choice) {
            case 1: {
                result = Calc.somma();
                break;
            }
            case 2: {
                result = Calc.differenza();
                break;
            }
            case 3: {
                result = Calc.moltiplicazione();
                break;
            }
            case 4: {
                result = Calc.divisione();
                break;
            }
            default: {
                System.out.print("Errore, operazione non permessa");
            }
        }
        System.out.print(result);
    }
}
