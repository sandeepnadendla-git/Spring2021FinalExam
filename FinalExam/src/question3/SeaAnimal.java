/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Sandeep Nadendla
 */
public class SeaAnimal extends Animal {
    public double depthDives;

    public SeaAnimal(double depthDives, String name, String type, int age) {
        super(name, type, age);
        this.depthDives = depthDives;
    }

    public double getDepthDives() {
        return depthDives;
    }

    public void setDepthDives(double depthDives) {
        this.depthDives = depthDives;
    }

    @Override
    public String toString() {
        return "SeaAnimal{" + "depthDives=" + depthDives + '}';
    }
    
    
}
