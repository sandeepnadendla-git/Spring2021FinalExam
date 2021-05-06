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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mobile m = new Mobile("Apple", 342);
        Mobile m2 = new Mobile("Apple", 342);
        Mobile m3 = new Mobile("Samsung", 342);

        System.out.println("Question 11 Answer: Sandeep Nadendla");
        System.out.println("Checking two same content objects using equals method ");
        System.out.println(m.equals(m2));
        System.out.println("Checking two different content  objects using equals method ");
        System.out.println(m.equals(m3));
        System.out.println("Checking two different content  objects using equals method ");
        System.out.println(m2.equals(m3));

    }

}
