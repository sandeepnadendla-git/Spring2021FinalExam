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
public class Throwexample {

    static int sum(int n1, int n2) {
        if (n1 == 0) {
            throw new ArithmeticException("First parameter is not valid");
        } else {
            System.out.println("Both parameters are correct!!");
        }
        return n1 + n2;
    }

    public static void main(String args[]) {
        System.out.println("Question 9 throw example 1 Answer: Sandeep Nadendla");

        int res = sum(0, 12);
        System.out.println(res);
        System.out.println("Continue Next statements");
    }
}
