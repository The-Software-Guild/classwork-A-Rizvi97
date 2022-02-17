/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.awr.rps;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Frizbeee
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        Random randomiser = new Random();
        Scanner input = new Scanner(System.in);
        int rounds;
        System.out.println("How many round between 1 and 10");
        rounds = Integer.parseInt(input.nextLine());
        
        
        if (rounds > 10 || rounds < 0){
            System.out.println("Goodbye");
            System.exit(0);
        }
        System.out.println("lets play " + rounds + " rounds");
        
        
//        int usermove;
//        int compmove;
//        System.out.println("What is your move?");
//        System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
//        usermove = Integer.parseInt(input.nextLine());
//        
//        compmove = randomiser.nextInt(3)+1;
//        
//        if (compmove == usermove){
//            System.out.println( "Tied");
//        } else if (compmove == 1 && usermove == 2){
//            System.out.println( "User Wins");
//        } else if (compmove == 1 && usermove == 3){
//            System.out.println( "Computer Wins");
//        } else if (compmove == 2 && usermove == 1){
//            System.out.println( "Computer Wins");
//        } else if (compmove == 2 && usermove == 3){
//            System.out.println( "User Wins");
//        } else if (compmove == 3 && usermove == 1){
//            System.out.println( "Computer Wins");
//        } else if (compmove == 3 && usermove == 2){
//            System.out.println( "User Wins");
//        }
        
    }
    
    public static void playRPS(){
        //Method for the game
        
        Random randomiser = new Random();
        int usermove;
        int compmove;
        System.out.println("What is your move?");
        System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
        usermove = Integer.parseInt(input.nextLine());
        
        compmove = randomiser.nextInt(3)+1;
        
        if (compmove == usermove){
            System.out.println( "Tied");
        } else if (compmove == 1 && usermove == 2){
            System.out.println( "User Wins");
        } else if (compmove == 1 && usermove == 3){
            System.out.println( "Computer Wins");
        } else if (compmove == 2 && usermove == 1){
            System.out.println( "Computer Wins");
        } else if (compmove == 2 && usermove == 3){
            System.out.println( "User Wins");
        } else if (compmove == 3 && usermove == 1){
            System.out.println( "Computer Wins");
        } else if (compmove == 3 && usermove == 2){
            System.out.println( "User Wins");
        }
        
    }
    
    
    
}
