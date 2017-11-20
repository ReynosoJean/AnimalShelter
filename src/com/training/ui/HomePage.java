package com.training.ui;

import java.util.Scanner;

import com.training.manager.HomePageManager;

public class HomePage {
	

	public void displayHomePage() {
		Scanner optionScanner = new Scanner(System.in);
		int option;
		System.out.println("WELCOME TO JEAN'S ANIMAL SHELTER");
		System.out.println("PLEASE SELECT AN OPTION:");
		System.out.println("[1] Add an Animal");
		System.out.println("[2] Remove an Animal");
		System.out.println("[3] View all Animals");
		
		option = optionScanner.nextInt();
		
		HomePageManager homePageManager = new HomePageManager();
		homePageManager.doOption(option);
	}
}
