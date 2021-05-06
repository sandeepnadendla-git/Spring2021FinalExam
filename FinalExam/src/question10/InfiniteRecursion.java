/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;

/**
 *
 * @author Sandeep Nadendla
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Question 10 Answer: Sandeep Nadendla");
               System.out.print("Enter number to get their multiples: ");
                Scanner sc=new Scanner(System.in);
                long n=sc.nextLong();
                System.out.println("Printing multiples of "+n+" using recursion");
                System.out.println(threeMultiples(n,n));
                
                

    }
    public static int threeMultiples(long n,long n1){
                  System.out.println(n1);
           return threeMultiples(n,n1+n);
       
    }
    
}
