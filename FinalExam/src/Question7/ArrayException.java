/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Sandeep Nadendla
 */
public class ArrayException {
    
    public static void main(String[] args) {
        System.out.println("Question 7 Answer: Sandeep Nadendla");
        
        int[] a = new int[100];
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i < a.length) {
            a[i] = (int) (Math.random() * 100) + 1;
            i++;
        }
        System.out.print("Enter the index of the array: ");
        int n = a[sc.nextInt()];

        try {
            System.out.println("The corresponding element is " + n);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }}

