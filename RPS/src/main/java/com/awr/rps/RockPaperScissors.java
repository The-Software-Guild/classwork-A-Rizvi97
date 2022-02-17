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
        
        //Random randomiser = new Random();
        Scanner input = new Scanner(System.in);
        int rounds;
        String choice;
        boolean play = true;
//        int compcount = 0;
//        int usercount = 0;
//        int tiecount = 0;     
        
        while (play){
            
            
            System.out.println("How many round between 1 and 10");
            rounds = Integer.parseInt(input.nextLine());


            if (rounds > 10 || rounds < 0){
                System.out.println("Goodbye");
                System.exit(0);
            }
            System.out.println("lets play " + rounds + " rounds");


            playRPS1(rounds);
            
            System.out.println("Do you want to play?");
            System.out.println("(y)es or (n)o");
            choice = input.nextLine();
            
            if (choice .equals("n")){
                play = false;
                break;
            }
            
        }
//        
    }
    public static void playRPS1(int rounds){
    
        Scanner input = new Scanner(System.in);
        Random randomiser = new Random();
        
        int uwin = 0;
        int cwin = 0;
        int ties = 0;
    
        for (int i=0; i<rounds; i++){
            //playRPS();
            
            int usermove;
            int compmove;
            
            System.out.println("What is your move?");
            System.out.println("Enter 1 for rock, 2 for paper or 3 for scissors");
            usermove = Integer.parseInt(input.nextLine());

            compmove = randomiser.nextInt(3)+1;

            if (compmove == usermove){
                ties += 1;
                System.out.println( "Tied");
            } else if (compmove == 1 && usermove == 2){
                uwin += 1;
                System.out.println( "User Wins");
            } else if (compmove == 1 && usermove == 3){
                cwin += 1;
                System.out.println( "Computer Wins");
            } else if (compmove == 2 && usermove == 1){
                cwin += 1;
                System.out.println( "Computer Wins");
            } else if (compmove == 2 && usermove == 3){
                uwin += 1;
                System.out.println( "User Wins");
            } else if (compmove == 3 && usermove == 1){
                cwin += 1;
                System.out.println( "Computer Wins");
            } else if (compmove == 3 && usermove == 2){
                uwin += 1;
                System.out.println( "User Wins");
            }
            System.out.println(uwin + " " + cwin + " " + ties);              
            
            if (ties >= cwin && ties >= uwin){
                System.out.println("It's a tie");
            } else if (cwin >= ties && cwin >= uwin){
                System.out.println("Computer Wins");
            } else if (uwin >= cwin && uwin >= ties){
                System.out.println("You win");
            }
            
        }
    
        
       
    }
    
}
