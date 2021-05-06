/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sandeep Nadendla
 */
public class ThrowsExample1 {

    public void method1() throws ArithmeticException {
        throw new ArithmeticException("Calculation error");
    }

    public void method2() throws ArithmeticException {
        method1();
    }

    public void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }
    }

    public static void main(String args[]) {
        System.out.println("Question 9 throws example 1 Answer: Sandeep Nadendla");
        ThrowsExample1 obj = new ThrowsExample1();
        obj.method3();
        System.out.println("End Of Program");
    }
}
