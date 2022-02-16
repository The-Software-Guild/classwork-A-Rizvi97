/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Frizbeee
 */
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        // Intialise and declare variables and scanner
        String noun1, adj1, noun2, adj2, plnoun1, plnoun2, plnoun3, verbpres;
        String verbpast;
        int num;
        
        Scanner inputReader = new Scanner(System.in);
        
        // ask for user input
        
        System.out.println("I need a noun: ");
        noun1 = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        adj1 = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        
        System.out.println("And a number: ");
        num = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("Another adjective: ");
        adj2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        plnoun1 = inputReader.nextLine();
        
        System.out.println("And another: ");
        plnoun2 = inputReader.nextLine();
        
        System.out.println("And another: ");
        plnoun3 = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        verbpres = inputReader.nextLine();
        
        System.out.println("Same verb (past principle): ");
        verbpast = inputReader.nextLine();
        
        //Now print madlib
        System.out.println("NOW LETS GET MAD");
        
        System.out.println(noun1 + ": the " + adj1 + " frontier. These are the voyages of the starship " + noun2 + ".");
        
        System.out.println("Its " + num + " Mission: To explore strange " + adj2 + " " + plnoun1 + ", to seek out " + adj2 + " " + plnoun2 + ",");
        
        System.out.println("and " + adj2 + " " + plnoun3 + ", to boldly " + verbpres+ " where no one has ever " + verbpast + " before.");
        
    }
    
}
