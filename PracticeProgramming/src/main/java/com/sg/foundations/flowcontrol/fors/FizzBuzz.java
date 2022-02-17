/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

/**
 *
 * @author Frizbeee
 */
public class FizzBuzz {
    public static void main(String[] args) {
        //start here
        Scanner sc = new Scanner(System.in);
        int num;
        
        
        System.out.println("Please enter a number");
        num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num + 1; i++) {
            
            if (i == num){
                break;
            } else if (i == 0) {
               System.out.println(i);                
            } else if (i % 3 == 0 && i %5 == 0) {
               System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
               System.out.println("fizz"); 
            } else if (i % 5 == 0) {
               System.out.println("buzz");
            } else {
               System.out.println(i); 
            }
            
        }
        
        System.out.println("TRADITION!!!!");        
    }
    
}
