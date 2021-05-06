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
public class Example2 {

    public static void main(String args[]) throws NullPointerException, ArithmeticException {
        String str = null;
        System.out.println("Question 8 example 2 Answer: Sandeep Nadendla");
        try {

            if (str.equals("gfg")) {
                System.out.print("Same");
            } else {
                System.out.print("Not Same");
            }
        } catch (NullPointerException e) {
            System.out.println("Nullpointer Exception");

            try {
                int arr[] = {10, 11, 12, 13, 14};
                int result = arr[1] / 0;

            } catch (ArithmeticException e1) {
                System.out.println("Divide by zero is not possible");
            }

        }
    }
}
