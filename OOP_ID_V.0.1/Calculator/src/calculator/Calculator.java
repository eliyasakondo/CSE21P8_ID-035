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
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
        System.out.println("Welcome! Akondo Group here for easier your calculation");
        System.out.println("Selcet your operation from below \n 1. Addition. \n 2. Subtraction \n 3. Multiplication \n 4. Division."
                + " \n 5. Modulas\n 6. Square\n 7. Root.\n 8.  10. Exit.\n ");
        int ch=s.nextInt();
        //input variable 
        int a,b;
      switch(ch){
          case 1: //Addition
              Addition add = new Addition();
              add.Add();
              break;
          case 2:
              Subtraction sub=new Subtraction();
              sub.Sub();
              break;
          case 3:
               Multiplication mul=new Multiplication();
              mul.Mul();
              break;
          case 4:
              Division div=new Division();
              div.Div();
              break;
          case 5: 
              Modulus mod=new Modulus();
              mod.Mod();
                      
          default:
              System.out.println("Wrong Information sir!");
              
      }
        
        
        
    }
    
}
