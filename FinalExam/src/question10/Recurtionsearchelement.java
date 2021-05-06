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
public class Recurtionsearchelement {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    /* Recursive Method to search x in arr[l..r] */
    static int Searcharray(int inptarr[], int index, int len, int srcelement) {
        if (len < index) {
            return -1;
        }
        if (inptarr[index] == srcelement) {
            return index;
        }
        if (inptarr[len] == srcelement) {
            return len;
        }
        return Searcharray(inptarr, index + 1, len - 1, srcelement);
    }

    // Driver method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Question 10 Answer: Sandeep Nadendla");
        System.out.print("Enter element to search: ");
        int srcelement = sc.nextInt();
        int[] inptarr = {23, 132, 540, 21, 345};
        //Method call to find x
        int srchindex = Searcharray(inptarr, 0, inptarr.length - 1, srcelement);
        if (srchindex != -1) {
            System.out.println("Element " + srcelement + " is present at index "
                    + srchindex);
        } else {
            System.out.println("Element " + srcelement + " is not present");
        }
    }
}
