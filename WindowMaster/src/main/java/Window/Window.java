/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Window;

/**
 *
 * @author Frizbeee
 */
import java.util.Scanner;

/**
 *
 * @author Frizbeee
 */
public class Window {
    




    public static void main(String[] args) {
        // declare h and w variables and initialize to 0
        float height = 0;
        float width = 0;


        float perimeter;
        float cost;
        float area;
        
        String stringHeight = "";
        String stringWidth = "";

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();  
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        area = height * width;
        perimeter = 2 * (height + width);
        
        
        
        cost = 3.5f * area + 2.25f * perimeter;
     

        

        // print the sum to the console
        System.out.println("Cost is: " + cost);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }

}