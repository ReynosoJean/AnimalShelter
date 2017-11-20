package com.training.ui;


import com.training.manager.AddCatManager;
import com.training.manager.AddDogManager;
import com.training.manager.AddParrotManager;
import com.training.manager.AllAnimalsManager;
import com.training.manager.ViewAllAnimalsManager;

public class ViewAllAnimals extends AddDogManager{


	public void dispalyAllAnimals() {
		ViewAllAnimalsManager.viewAllDogs(AddDogManager.getList());
		ViewAllAnimalsManager.viewAllCats(AddCatManager.getList());
		ViewAllAnimalsManager.viewAllParrots(AddParrotManager.getList());
	}
}
