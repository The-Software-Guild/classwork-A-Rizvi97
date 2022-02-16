/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Frizbeee
 */
public class MiniZork {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Open the mailbox, go to the house, or go home? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                    System.out.println("you feel something with your fingertips");
                    System.out.println("reach further or leave?");
                    action = userInput.nextLine();
                    
                    if (action.equals("reach further")) {
                        System.out.println("you get sucked through a portal and.... TBC");
                                         
                    } else if (action.equals("leave")) {
                            System.out.println("you leave and forget about it");
                    }
                }
        } else if (action.equals("go to the house")) {
                System.out.println("stairs or kitchen?");
                action = userInput.nextLine();
                
        }
    }
    
}
