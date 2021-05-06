/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author Sandeep Nadendla
 */
public class PenDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pen p = new Pen("Red", 3.5);
        Pen p1 = new Pen("Red", 3.5);
        Pen p2 = new Pen("Blue", 3.5);

        System.out.println("Question 11 Answer: Sandeep Nadendla");
        System.out.println("getting hashcode using hashCode method ");
        System.out.println("Hash code of object p: " + p.hashCode());
        System.out.println("Hash code of object p1: " + p1.hashCode());
        System.out.println("Hash code of object p2: " + p2.hashCode());

        System.out.println("As contents of p and p1 are same the hashcode of p and p1 are same");
    }

}
