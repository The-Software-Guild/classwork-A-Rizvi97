/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.awr.luckysevens;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Frizbeee
 */
public class LuckySevens {
    public static void main(String[] args) {
        
        //Start
        
        Scanner input = new Scanner(System.in);
        Random roll = new Random();
        
        int dieone;
        int dietwo;
        int balance;
        int count=0;
        int maxbalance;
        int countmax=0;
        
        System.out.println("How many dollars do you have?");
        balance = Integer.parseInt(input.nextLine());
        maxbalance = balance;
        
        while (balance > 0){
            //
            
            count++;
            dieone = roll.nextInt(6)+1;
            dietwo = roll.nextInt(6)+1;
            //System.out.println(dieone);
            //System.out.println(dietwo);

            if (dieone + dietwo == 7){
                balance += 4;
            } else {
                balance -= 1;
            }
            
            if (balance > maxbalance){
                maxbalance = balance;
                countmax = count;
            }
        
        }
        System.out.println("you are broke after " + count + " rolls");
        System.out.print("You shoud've quit after " + countmax + " rolls");
        System.out.println(" when you had $" + maxbalance);
    }
    
}
