package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalBean;

public class AddParrotManager extends AllAnimalsManager{
	public static List<AnimalBean> listOfParrots = new ArrayList<AnimalBean>();

	public void AddParrot(AnimalBean animal) {
		listOfParrots.add(animal);
		
	}

	public static List<AnimalBean> getList() {
		return listOfParrots;
	}
}
