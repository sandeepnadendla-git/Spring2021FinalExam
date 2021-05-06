/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S541768
 */
public class UncheckedExample {

    public static void main(String args[]) {
        System.out.println("Question 6 Answer for unchecked exception: Sandeep Nadendla");
        try {
            int arr[] = {10, 11, 12, 13, 14};
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The specified index does not exist ");
        }
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
        } catch (ArithmeticException e1) {
            System.out.println("Division with zero is not possible");
        }
    }
}
