/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandinstance;

import cars.Car;
import cars.CarFromObject;

public class ClassAndInstance {

    public static void main(String[] args) {
        Car car1 = new Car("March", 3);
        System.out.println(car1.description());
        Car car2 = new Car("Benz", 5);
        System.out.println(car2.description());
        Car car3 = new Car("March", 3);
        System.out.println(car3.description());
        
        System.out.printf("does car1 equals car2? %b\n", car1 == car2);
        System.out.printf("does car1 equals car3? %b\n", car1 == car3);
        
        System.out.println("\n===================================\n");
        
        CarFromObject car4 = new CarFromObject("Toyota", 5);
        CarFromObject car5 = new CarFromObject("Toyota", 5);
        System.out.printf("does car4 equals car5? %b\n", car4.equals(car5));
        
        System.out.println("\n===================================\n");
        
        Integer x = 100;
        Integer y = 100;
        System.out.printf("does x equals y? %b\n", x == y);
        x = 300;
        y = 300;
        System.out.printf("does x equals y? %b\n", x == y);
        System.out.printf("does x equals y? %b\n", x.equals(y));
        
        
    }
    
}
