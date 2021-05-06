/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Sandeep Nadendla
 */
public class CheckedException {
    
    public static void main(String args[]) throws FileNotFoundException, IOException 
   {
       
       System.out.println("Question 6 Answer: Sandeep Nadendla");
	FileInputStream file = null;
	
        file = new FileInputStream("input.txt"); 
	int n; 

	
         
	while(( n = file.read() ) != -1) 
	{ 
		System.out.print((char)n); 
	} 

	
	file.close(); 	
   }
}