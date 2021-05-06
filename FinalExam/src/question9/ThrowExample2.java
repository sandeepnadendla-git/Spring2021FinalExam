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
public class ThrowExample2 {

    public static void validate(int age) {
        try {
            if (age < 18) {
                throw new ArithmeticException("not valid");
            } else {
                System.out.println("welcome to vote");
            }
        } catch (ArithmeticException e) {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String args[]) {
        System.out.println("Question 9 throw example 2 Answer: Sandeep Nadendla");
        validate(13);
        System.out.println("rest of the code");
    }

}
