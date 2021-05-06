/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sandeep Nadendla
 */
public class Castingexample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Question 3 Answer: Sandeep Nadendla");
        
        int a = 25;
        int b = 3;

        double avg = a / b;
        System.out.println("Changed int to double by java");
        System.out.println(avg);
        System.out.println("Changed int to double by user");
        avg = (double) a / b;
        System.out.println(avg);

    }

}
