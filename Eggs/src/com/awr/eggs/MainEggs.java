package com.awr.eggs;
import java.util.Scanner;


public class MainEggs {
	//int eggs=0;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Eggs e = new Eggs();
		int egg;
		System.out.println("Enter number of eggs");
		egg = Integer.parseInt(input.nextLine());
		e.setEggs(egg);
		System.out.println("Gross: "+ e.getGross() +" Dozens "+ e.getDozen() + " Remainder: "+ e.getRemainder());
	}

}
