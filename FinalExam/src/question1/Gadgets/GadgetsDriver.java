/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Gadgets;

/**
 *
 * @author Sandeep Nadendla
 */
public class GadgetsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 1 Answer: Sandeep Nadendla");
        Laptop L1 = new Laptop(123, "LG", "Orange");
        System.out.println(L1);
        L1.showTypeofGadget();
        Iphone phone1 = new Iphone(345, "Apple", "Red");
        System.out.println(phone1);
        phone1.showTypeofGadget();

    }

}
