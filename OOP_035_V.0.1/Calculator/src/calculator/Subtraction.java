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
public class Subtraction {
    void Sub(){
         int a,b,sub;
         Scanner s=new Scanner(System.in);
          System.out.println("Enter first value for Subtraction ");
              a=s.nextInt();
              System.out.println("Enter Second value for Subtraction");
              b=s.nextInt();
              sub=a-b;
              System.out.println("The result is "+sub);
    }
    
}
