/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator.util;

import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author feder
 */
public class MyUtility {

    final static String ERR_VALUE_NEGATIVE = "NEGATIVE VALUE, NOT ALLOWED";
    final static String ERR_VALUE_ZERO = "ZERO VALUE, NOT ALLOWED";
    final static String ERR_VALUE_MIN = "MIN VALUE IS ";
    final static String ERR_VALUE_MAX = "MAX VALUE IS ";
    final static String ERR_VALUE_POSITIVE = "";
    final static String ERR_VALUE_BIG = "";
    final static String ERR_VALUE_NUMERIC = "";

    /*
    DOUBLE METHOD
     */
    public static double getDoubleNumber(String messaggio) {
        double value = 0;

        System.out.println(messaggio);
        Scanner in = new Scanner(System.in);
        try {
            value = in.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(" " + e);
        }

        if (Double.isNaN(value)) {
            //throw new InputException("Not numeric data", value);
        }

        return value;

    }

    public static double getDoubleNumberNotNegative(String messaggio) {
        Scanner in = new Scanner(System.in);
        double result = 0;
        do {
            try {
                result = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(NOT__NUMERIC__DATA_ + e);
            }
            System.out.println(ERR_VALUE_NEGATIVE);

        } while (result < 0);

        if (Double.isNaN(result)) {
            //throw new InputException("Not numeric data", result);
        }
        return result;

    }
    private static final String NOT__NUMERIC__DATA_ = "Not Numeric Data ";

    public static double getDoubleNumberNotZero(String messaggio) {
        Scanner in = new Scanner(System.in);
        double result = 0;
        do {
            try {
                result = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(e.getCause() + e.getMessage());
                System.out.println(" " + e);
            }
            System.out.println(ERR_VALUE_ZERO);

        } while (result == 0);

        if (Double.isNaN(result)) {
            //throw new InputException("Not numeric data", result);
        }
        return result;

    }

    /*
        INT METHOD
     */
    public static int getIntNumber(String messaggio) {

        double result = 0;
        Scanner in = new Scanner(System.in);
        try {
            result = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(NOT__NUMERIC__DATA_);
        }

        if (Double.isNaN(result)) {
            //throw new InputException("Not numeric data", result);
        }

        return (int) result;
    }

    public static int getIntNumberNotNegative(String messaggio) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        boolean ok = false;
        do {

            try {
                result = in.nextInt();
                if (result < 0) {
                    System.out.println(ERR_VALUE_NEGATIVE);
                } else {
                    ok = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(NOT__NUMERIC__DATA_);
            }

        } while (!ok);

        return result;
    }

    public static int getIntNumberNotZero(String messaggio) {
        int result = 0;
        Scanner in = new Scanner(System.in);
        boolean ok = false;
        do {
            try {
                result = in.nextInt();
                if (result == 0) {
                    System.out.println(ERR_VALUE_ZERO);
                } else {
                    ok = true;
                }
            } catch (InputMismatchException e) {
                System.out.println(NOT__NUMERIC__DATA_);
                //throw new InputException("Not numeric data " + e.getMessage() , result);
            }

        } while (!ok);

        return result;
    }

    public static int getIntNumberMinMax(String messaggio, int min, int max) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        boolean ok = false;
        do {
            System.out.println(messaggio);

            try {
                result = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(NOT__NUMERIC__DATA_);
                //throw new InputException("Not numeric data " + e.getMessage() , result);
            }

            if (result < 0) {
                System.out.println(ERR_VALUE_NEGATIVE);
            } else if (result < min) {
                System.out.println(ERR_VALUE_MIN + min);

            } else if (result > max) {
                System.out.println(ERR_VALUE_MAX + max);
            } else {
                ok = true;
            }

        } while (!ok);

        return result;
    }

}
