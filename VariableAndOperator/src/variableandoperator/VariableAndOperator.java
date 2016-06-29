/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variableandoperator;

import java.io.PrintStream;

/**
 *
 * @author ckpiggy
 */
public class VariableAndOperator {

    public static void main(String[] args) {
        int x = 10;
        float y = 9.9f;
        double z = 9.99;
        char a = 'A';
        int b = 1;
        String seperator = "\n=======================\n";
        
        System.out.printf("x + y = %f\n", x + y);
        System.out.printf("x - a = %d\n", x - a);
        System.out.printf("y * z = %f\n", y * z);
        System.out.printf("x mod b = %d\n", x % b);
//        System.out.printf("b / x = %f\n", b / x);
        System.out.println(seperator);
        
        System.out.printf("x > y = %b\n", x > y);
        System.out.printf("x < y = %b\n", x < y);
        System.out.printf("x == y = %b\n", x == y);
        System.out.printf("x != y = %b\n", x != y);
        System.out.println(seperator);
        
        System.out.printf("x > y AND y > z = %b\n", x > y && y > z);
        System.out.printf("x > y OR y > z = %b\n", x > y || y > z);
        System.out.println(seperator);
        
        System.out.printf("x = %d\n", x);
        x += 1;
        System.out.printf("x = %d\n", x);
        System.out.printf("z = %f\n", z);
        z -= y;
        System.out.printf("z = %f\n", z);
        
    }
    
}
