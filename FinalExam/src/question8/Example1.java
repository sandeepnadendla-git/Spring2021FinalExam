/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Sandeep Nadendla
 */
public class Example1 {

    public static int divideByZero(int a, int b) {

        int result = a / b;

        return result;
    }

    public static int computeDivision(int a, int b) {

        int res = 0;

        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException is occured");
        }
        return res;
    }

    public static void main(String args[]) {

        int a = 1;
        int b = 0;
        System.out.println("Question 8 example 1 Answer: Sandeep Nadendla");

        try {
            int i = computeDivision(a, b);

        } catch (ArithmeticException ex) {

            System.out.println("Division with zero is not possible");
        }
    }
}
