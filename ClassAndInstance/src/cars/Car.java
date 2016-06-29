/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

public class Car {
    String name;
    int capacity;
    
    public Car(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    public void run(){
        System.out.println(this.name + " is running");
    }
    
    public String description(){
        return String.format("%s is a car with %d seats", this.name, this.capacity);
    }
}
