/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Abstract1;

/**
 *
 * @author Sandeep Nadendla
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 1 Answer: Sandeep Nadendla");
        Himalayan him = new Himalayan();
        him.setBottleDimensions(12, 20);
        System.out.println(him.manfacturePlace());
    }

}
