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
public class Kinley extends WaterService {

    double height;
    double diameter;

    @Override
    public void setBottleDimensions(double height, double diameter) {
        this.height = height * 1.2;
        this.diameter = diameter;
    }
}
