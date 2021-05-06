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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 Answer: Sandeep Nadendla");

        SeaAnimal se=new SeaAnimal(100.2, "Shark", "Carnivorus", 10);
        
        Animal an=(Animal)se;
        
        System.out.println(an);
    }

}
