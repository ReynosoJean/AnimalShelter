package com.training.manager;

import com.training.beans.AnimalBean;
import com.training.ui.AnimalDetails;

public class AnimalTypeManager {
	public void getAnimalChoice(int animalType) {
		
		if (animalType == 1) {
			AddDogManager addDogManager = new AddDogManager();
			AnimalDetails animalDetails = new AnimalDetails();
			AnimalBean animal = new AnimalBean();
			animal = animalDetails.displayAnimalDetails();
			animal.setRefID(getDogRefID());
			addDogManager.AddDog(animal);
			
		} else if (animalType == 2) {

			AddCatManager addCatManager = new AddCatManager();
			AnimalDetails animalDetails = new AnimalDetails();
			AnimalBean animal = new AnimalBean();
			animal = animalDetails.displayAnimalDetails();
			animal.setRefID(getCatRefID());
			addCatManager.AddCat(animal);
			
		} else if (animalType == 3) {
			AddParrotManager addParrotManager = new AddParrotManager();
			AnimalDetails animalDetails = new AnimalDetails();
			AnimalBean animal = new AnimalBean();
			animal = animalDetails.displayAnimalDetails();
			animal.setRefID(getParrotRefID());
			addParrotManager.AddParrot(animal);
			
			}
	}


	public static int getDogRefID() {
		int dogRefID;
		if (AddDogManager.getList().size() == 0) {
			dogRefID = 1000;
		} else {
			dogRefID = AddDogManager.getList().size() + 1000;
		}
		dogRefID++;
		return dogRefID;
	}
	
	public static int getCatRefID() {
		int catRefID;
		if (AddCatManager.getList().size() == 0) {
			catRefID = 2000;
		}else {
			catRefID = AddCatManager.getList().size() + 2000;
		}
		catRefID++;
		return catRefID;
	}
	
	public static int getParrotRefID() {
		int parrotRefID;
		if (AddParrotManager.getList().size() == 0) {
			parrotRefID = 3000;
		} else {
			parrotRefID = AddParrotManager.getList().size() + 3000;
		}
		parrotRefID++;
		return parrotRefID;
	}
}
