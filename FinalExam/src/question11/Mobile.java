/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Sandeep Nadendla
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Mobile {
    private String Brand;
    private int Price;

    public Mobile(String Brand, int Price) {
        this.Brand = Brand;
        this.Price = Price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        final Mobile other = (Mobile) obj;
        
        if (this.Brand != other.Brand) {
            return false;
        }
        if (!Objects.equals(this.Brand, other.Brand)) {
            return false;
        }
        
        return true;
    }



    
    
    
}