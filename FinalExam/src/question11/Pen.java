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
public class Pen {
    private String ink;
    private Double Cost;

    public Pen(String ink, Double Cost) {
        this.ink = ink;
        this.Cost = Cost;
    }

    
    public String getInk() {
        return ink;
    }

    public void setInk(String ink) {
        this.ink = ink;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double Cost) {
        this.Cost = Cost;
    }

    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + ", Cost=" + Cost + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.ink);
        hash = 97 * hash + Objects.hashCode(this.Cost);
        return hash;
    }

       
    
    
}
