package com.training.main;

import com.training.ui.HomePage;

public class AnimalShelterMain {

	public static void main(String[] args) {
		//welcome message
		int input = 0;
		do {
		HomePage homePage = new HomePage();
		homePage.displayHomePage();
		//input option
		}while(input<=10);
		
	}
}
