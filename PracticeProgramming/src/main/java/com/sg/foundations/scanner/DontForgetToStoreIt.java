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
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {

        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, colour;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        Double.parseDouble(inputReader.nextLine());

        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        Integer.parseInt(inputReader.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        colour = inputReader.nextLine();

        System.out.println("Ooh, " + colour + " " + cheese +" sounds delicious!");
        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
    }
    
}
