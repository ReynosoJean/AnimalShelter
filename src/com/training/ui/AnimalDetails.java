package com.training.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.beans.AnimalBean;
import com.training.manager.AddDogManager;
import com.training.manager.AllAnimalsManager;
import com.training.manager.AnimalTypeManager;


public class AnimalDetails extends AnimalBean{
	public static AnimalBean displayAnimalDetails() {
		String name;
		int age;
		String gender;
		int ref = 0;
		
		List<AnimalBean> listOfAnimalDetails = new ArrayList<AnimalBean>();
		AnimalBean animal = new AnimalBean();
		
		System.out.println("Enter Animal Name:");
		Scanner nameInput = new Scanner(System.in);
		name = nameInput.nextLine();
		System.out.println("Enter Animal Age:");
		Scanner ageInput = new Scanner(System.in);
		age = ageInput.nextInt();
		System.out.println("Enter Animal Gender:");
		Scanner genderInput = new Scanner(System.in);
		gender = genderInput.nextLine();
		
		
		
		animal.setName(name);
		animal.setAge(age);
		animal.setGender(gender);
		return animal;
	
	}
}
