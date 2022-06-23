/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author eliyas
 */
public class Addition {
     void Add(){
         int a,b,sum;
         Scanner s=new Scanner(System.in);
          System.out.println("Enter first value for Addition");
              a=s.nextInt();
              System.out.println("Enter Second value for Addition");
              b=s.nextInt();
              sum=a+b;
              System.out.println("The result is "+sum);
    }
    
}
