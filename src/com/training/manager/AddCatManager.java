package com.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.training.beans.AnimalBean;

public class AddCatManager{
	public static List<AnimalBean> listOfCats = new ArrayList<AnimalBean>();

	public void AddCat(AnimalBean animal) {
		listOfCats.add(animal);
		
	}

	public static List<AnimalBean> getList() {
		return listOfCats;
	}
}
