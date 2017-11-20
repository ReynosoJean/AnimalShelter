package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalBean;
import com.training.beans.DogBean;
import com.training.ui.ViewAllAnimals;

public class AddDogManager{
	public static List<AnimalBean> listOfDogs = new ArrayList<AnimalBean>();

	public void AddDog(AnimalBean animal) {
		listOfDogs.add(animal);
		
	}

	public static List<AnimalBean> getList() {
		return listOfDogs;
	}

}
