/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Frizbeee
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Random randomiser = new Random();
        Scanner sc = new Scanner(System.in);
        
        int guess;
        
        int num = randomiser.nextInt(10 + 10) - 10;
        boolean isright = false;
        
        System.out.println(num);
        
        
        System.out.println("Guess The Number between -10 and 10");
        do {
            
            
            guess = Integer.parseInt(sc.nextLine());
        
            if (num == guess){
               isright = true;
               System.out.println("Well done");
            } else if (num < guess) {

                System.out.println("Too High");
                //guess = Integer.parseInt(sc.nextLine());
            } else if (num > guess){

                System.out.println("Too Low");
                //guess = Integer.parseInt(sc.nextLine());
            }
    
        } while (!isright);
    }
    
}
