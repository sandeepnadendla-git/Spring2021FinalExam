/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Sandeep Nadendla
 */
public class Unchecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 10;
        System.out.println("Question 6 Answer for unchecked exception: Sandeep Nadendla");
        int num2 = 0;
        /*Since I'm dividing an integer with 0
	 * it should throw ArithmeticException
         */
        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException caught");
        }
    }
}
