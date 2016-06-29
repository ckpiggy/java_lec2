/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printprintprint;

/**
 *
 * @author ckpiggy
 */
public class PrintPrintPrint {

    public static void main(String[] args) {
        //declare a seperator string
        String seperator = "\n====================================\n";
        System.out.printf("size of byte:\t%d\n",Byte.SIZE);
        System.out.printf("range of byte:\t%d ~ %d\n",Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(seperator);
        
        System.out.printf("size of short:\t%d\n",Short.SIZE);
        System.out.printf("range of short:\t%d ~ %d\n",Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println(seperator);
        
        System.out.printf("size of integer:\t%d\n", Integer.SIZE);
        System.out.printf("range of integer:\t%d ~ %d\n",Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(seperator);
        
        System.out.printf("size of long:\t%d\n", Long.SIZE);
        System.out.printf("range of long:\t%d ~ %d\n",Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(seperator);
        
        System.out.printf("size of float:\t%d\n", Float.SIZE);
        System.out.printf("exponent range of float:\t%d ~ %d\n",Float.MIN_EXPONENT, Float.MAX_EXPONENT );
        System.out.printf("positive range of float:\t%f ~ %f\n", Float.MIN_VALUE, Float.MAX_VALUE);
        float floatTest = 1.0f /3.0f;
        System.out.printf("%.30f\n",floatTest);
        System.out.println(seperator);
        
        System.out.printf("size of double:\t%d\n", Double.SIZE);
        System.out.printf("exponent range of double:\t%d ~ %d\n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
        System.out.printf("positive range of double:\t%f ~ %f\n", Double.MIN_VALUE, Double.MAX_VALUE);
        double doubleTest = 1.0 / 3.0;
        System.out.printf("%.30f\n", doubleTest);
        System.out.println(seperator);
        
        System.out.printf("size of char:\t%d\n", Character.SIZE);
        System.out.printf("range of char:\t%h ~ %h\n", Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.println(seperator);
        
        System.out.printf("true: %b, false: %b\n",Boolean.TRUE, Boolean.FALSE);
        
        
    }
    
    
    
}
