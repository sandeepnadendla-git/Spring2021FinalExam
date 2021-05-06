/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Polygon_Interface2;

/**
 *
 * @author  Sandeep Nadendla
 */
public class Square implements Polygon {

  // implementation of abstract method
  public void getArea(int side) {
    System.out.println("The area of the square is " + (side * side));
  }

    
}
