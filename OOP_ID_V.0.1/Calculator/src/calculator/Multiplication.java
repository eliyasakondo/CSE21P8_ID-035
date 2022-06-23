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
public class Multiplication {
    void Mul(){
         int a,b,mul;
         Scanner s=new Scanner(System.in);
          System.out.println("Enter first value for Multiplication");
              a=s.nextInt();
              System.out.println("Enter Second value for Multiplication");
              b=s.nextInt();
              mul=a*b;
              System.out.println("The result is "+mul);
    }
    
}
