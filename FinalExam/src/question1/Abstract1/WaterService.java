/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Abstract1;

/**
 *
 * @author Sandeep Nadendla
 */
public abstract class WaterService {

    public int quantity;

    public abstract void setBottleDimensions(double height, double diameter);

    public String manfacturePlace() {
        return "Vijayawada";
    }
}
