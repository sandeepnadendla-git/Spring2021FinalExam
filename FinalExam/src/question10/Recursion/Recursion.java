/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10.Recursion;

/**
 *
 * @author Sandeep Nadendla
 */
public class Recursion {

    public int count = 0;

    public void greet(String[] arr) {
        if (count < arr.length) {
            System.out.println("hello " + arr[count]);
            count++;
            greet(arr);

        }
    }

}
