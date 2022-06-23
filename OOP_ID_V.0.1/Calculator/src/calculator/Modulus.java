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
public class Modulus {
    void Mod(){
         int a,b,mod;
         Scanner s=new Scanner(System.in);
          System.out.println("Enter first value for Modulus");
              a=s.nextInt();
              System.out.println("Enter Second value for Addition");
              b=s.nextInt();
              mod=a%b;
              System.out.println("The result is "+mod);
    }
    
}
