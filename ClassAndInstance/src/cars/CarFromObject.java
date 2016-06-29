/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author ckpiggy
 */
public class CarFromObject extends Object {
    String name;
    int capacity;
    
    public CarFromObject(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    
    @Override public int hashCode(){
        return this.name.hashCode() * this.capacity;
    }
    
    @Override public boolean equals(Object obj){
        if(obj == null || !obj.getClass().equals(this.getClass())){
            return false;
        }else{
            return this.hashCode() == obj.hashCode();
        }
    }
}
