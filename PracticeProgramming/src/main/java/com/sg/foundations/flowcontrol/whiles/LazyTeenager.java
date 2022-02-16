/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;
/**
 *
 * @author Frizbeee
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        int prob;
        boolean willdo = false;
        prob = 0;
        Random randomiser = new Random();
        //int num;        
        do{
            prob +=1;
            int num = randomiser.nextInt(10); 
            System.out.println("Clean your Room!!");
            System.out.println(num);
            if (num <= prob) {
                System.out.println("Fine! Ill clean my room but I refuse eat my peas!");
                willdo = true;               
            } else if (prob >= 7) {
                System.out.println("you're grounded dand i'm taking the XBOX!");
                break;
            }
            //if rand int is less than prob
            
            
        
        
        
        } while (!willdo);
           
    }
    
}
