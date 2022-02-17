/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;
import java.util.Random;
/**
 *
 * @author Frizbeee
 */
public class BarelyControlledChaos {
    
    public static void main(String[] args) {
    
        

        String color = randcolor(); // call color method here
        String animal = randanimal(); // call animal method again here
        String colorAgain = randcolor(); // call color method again here
        int weight = randweight(); // call number method,
            // with a range between 5 - 200
        int distance = randdist(); // call number method,
            // with a range between 10 - 20
        int number = randnum(); // call number method,
            // with a range between 10000 - 20000
        int time = randtime(); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }
    
    
    // ??? Method 1 ???
    public static String randcolor(int c, String s){
        Random randomizer = new Random();
        c = randomizer.nextInt(5);
        //String s = "";
        if (c == 0){
            s = "Red";
        } else if (c == 1){
            s = "Blue";
        } else if (c == 2){
            s = "Blue";
        } else if (c == 3){
            s = "Blue";
        } else if (c == 4){
            s = "Blue";
        } 
        return s;
    } 
    // ??? Method 2 ???
    public static String randanimal(){
        return "Spanish Inquisition";
    }
    // ??? Method 3 ???
    
     public static int randweight(){
        Random randomizer = new Random();
        return randomizer.nextInt(200 - 5) + 5;
    }
   
    public static int randdist(){
        Random randomizer = new Random();
        return randomizer.nextInt(20 - 10) + 10;
    }
    public static int randnum(){
        Random randomizer = new Random();
        return randomizer.nextInt(20000 - 10000) + 10000;
    }
    
    public static int randtime(){
        Random randomizer = new Random();
        return randomizer.nextInt(6 - 2) + 2;
    }
    
}
