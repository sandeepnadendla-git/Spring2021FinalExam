/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S541768
 */
public class ThrowsExample2 {

    public static String readFile(String path) throws FileNotFoundException {
        String data = null;
        Scanner sc = new Scanner(new File("sample.txt"));
        String input;
        StringBuffer sb = new StringBuffer();
        sb.append(sc.next());
        data = sb.toString();
        return data;
    }

    public static void main(String args[]) {

        System.out.println("Question 9 throws example 2 Answer: Sandeep Nadendla");

        try {
            readFile("sample.txt");
        } catch (Exception ex) {
            System.out.println("Exception occurred");
        }
    }
}
