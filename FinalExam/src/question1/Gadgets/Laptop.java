/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1.Gadgets;

/**
 *
 * @author  Sandeep Nadendla
 */
public class Laptop extends Gadgets{
    private int modelNO;
    private String brand;
    private String color;

    public Laptop(int modelNO, String brand, String color) {
        this.modelNO = modelNO;
        this.brand = brand;
        this.color = color;
    }

    public int getModelNO() {
        return modelNO;
    }

    public void setModelNO(int modelNO) {
        this.modelNO = modelNO;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" + "modelNO=" + modelNO + ", brand=" + brand + ", color=" + color + '}';
    }
    public   void showTypeofGadget(){
        System.out.println("the type of Gadget  is Laptop");
    }
    
    
}
