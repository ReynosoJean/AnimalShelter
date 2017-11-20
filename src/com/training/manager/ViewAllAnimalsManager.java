package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalBean;

public class ViewAllAnimalsManager{
	
	public static void viewAllDogs(List<AnimalBean> listOfAnimals) {
		List<AnimalBean> animalListDogs = listOfAnimals;
		for(AnimalBean dog: animalListDogs) {
			
			System.out.print(dog.getRefID() + " Arf...arf..arf I'm " + dog.getName()+" the Dog, ");
			System.out.println(dog.getAge()+" yrs old.");
			
		}
	}
	public static void viewAllCats(List<AnimalBean> listOfAnimals) {
		
		List<AnimalBean> animalListCats = listOfAnimals;
		for(AnimalBean cat: animalListCats) {
			
			System.out.print(cat.getRefID() + " Meow...meow...meow I'm " + cat.getName()+" the Cat, ");
			System.out.println(cat.getAge()+" yrs old.");
		
		}
	}
	
	public static void viewAllParrots(List<AnimalBean> listOfAnimals) {
		
		List<AnimalBean> animalListCats = listOfAnimals;
		for(AnimalBean parrot: animalListCats) {
			
			System.out.print(parrot.getRefID() + " Squawk...squawk...squawk I'm " + parrot.getName()+" the Parrot, ");
			System.out.println(parrot.getAge()+" yrs old.");
		
		}
	}
}
