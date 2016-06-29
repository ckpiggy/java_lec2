/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflow;


public class ControlFlow {

    
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 10);
        System.out.println("rand = " + rand);
        if (rand % 3 == 0){
            System.out.println("rand是3的倍數");
        }else if (rand % 3 == 1){
            System.out.println("rand = 3x + 1");
        }else{
            System.out.println("rand = 3x + 2");
        }
        
        switch (rand % 4){
            case 0 : 
                System.out.println("rand是4的倍數");
                break;
            case 1:
            case 2:
                System.out.println("rand = 4x +1 or 4x + 2");
                break;
            default:
                System.out.println("其他狀況");
                break;
        }
        
        for (int i = 0; i < rand; i ++){
            System.out.println(i);
        }
//        System.out.println(i);
        
        int rand2 = (int) (Math.random() * 10);
        
        while(rand2 != rand){
            rand2 = (int) (Math.random() * 10);
        }
        
        System.out.println("rand2 = " + rand2);
        
        int counter = 0;
        while(true){
            if (counter < rand){
                counter += 1;
            }else{
                break;
            }
        }
        
        System.out.println("counter = " + counter);
        
        //試著模擬骰子骰10次的結果
        
        //印出所有三位數中13與12的公倍數
        
    }
    
}
