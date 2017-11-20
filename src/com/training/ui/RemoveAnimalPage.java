package com.training.ui;

import java.util.Scanner;

import com.training.manager.RemoveManager;

public class RemoveAnimalPage {
	
	public int displayRemove() {
		
		System.out.println("Please enter reference ID: ");
		int refID;
		Scanner removeScanner = new Scanner(System.in);
		refID = removeScanner.nextInt();
		
		return refID;
	}
	public void displayRemovedAnimal() {
		System.out.println("The animal is now removed!");		
	}
	
	
}
