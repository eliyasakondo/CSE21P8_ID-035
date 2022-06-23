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
public class Division {
    void Div(){
         int a,b,div;
         Scanner s=new Scanner(System.in);
          System.out.println("Enter first value for Division");
              a=s.nextInt();
              System.out.println("Enter Second value for Division");
              b=s.nextInt();
              div=a/b;
              System.out.println("The result is "+div);
    }
    
}
