package com.training.manager;

import java.util.List;
import java.util.Scanner;

import com.training.beans.AnimalBean;
import com.training.ui.AddAnimalPage;
import com.training.ui.AnimalDetails;
import com.training.ui.RemoveAnimalPage;
import com.training.ui.ViewAllAnimals;

public class HomePageManager {
	public static void doOption(int option) {

		switch (option) {
		case 1: // display ADD Animal UI
			if (AddDogManager.getList().size() + AddCatManager.getList().size()
					+ AddParrotManager.getList().size() == 10) {
					AddAnimalPage addAnimalPage = new AddAnimalPage();

					int animalChoice = addAnimalPage.displayAddMenu(); // animalChoice is stored

					// display what type of animal UI
					AnimalTypeManager animalType = new AnimalTypeManager();
					animalType.getAnimalChoice(animalChoice);

					addAnimalPage.displaySuccessfulAdd();
			}
			break;
		case 2: // display REMOVE Animal UI
			RemoveManager removeManager = new RemoveManager();
			removeManager.removeAnimal();
			RemoveAnimalPage removeAnimal = new RemoveAnimalPage();
			removeAnimal.displayRemovedAnimal();
			break;

		case 3: // VIEW all Animals
			if (AddDogManager.getList().size() == 0 && AddCatManager.getList().size() == 0
					&& AddParrotManager.getList().size() == 0) {
				System.out.println("The Animal Shelter is empty.");
			} else {
				ViewAllAnimals viewAllAnimalPage = new ViewAllAnimals();
				viewAllAnimalPage.dispalyAllAnimals();
			}
			break;
		}
	}
}
