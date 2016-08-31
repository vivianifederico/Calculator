/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator.util;

/**
 *
 * @author federico
 */
public class InputException extends Exception {

    double value;
    /**
     * Constructs an instance of <code>InputException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     * @param value
     */
    public InputException(String msg, int value) {
        super(msg + Integer.toString(value));
        
    }
    
    public InputException(String msg, double value) {
        super(msg + Double.toString(value));
        
    }
}
