package com.training.manager;

import java.util.List;

import com.training.beans.AnimalBean;
import com.training.ui.RemoveAnimalPage;


public class RemoveManager {
	public void removeAnimal() {
		RemoveAnimalPage removeAnimal = new RemoveAnimalPage();
		int refID = removeAnimal.displayRemove();
		boolean isFound = false;
		
		if (refID < 2000 && refID > 1000) {
		
			for(AnimalBean dog: AddDogManager.getList()) {
				if(refID == dog.getRefID()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddDogManager.getList().remove(refID - 1001);
			}else {
				System.out.println("Animal ID not found!");
			}
				
		}else if(refID < 3000 && refID > 2000) {
			for(AnimalBean dog: AddDogManager.getList()) {
				if(refID == dog.getRefID()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddCatManager.getList().remove(refID - 2001);
			}else {
				System.out.println("Animal ID not found!");
			}
		}else if(refID < 4000 && refID > 3000) {
			for(AnimalBean dog: AddDogManager.getList()) {
				if(refID == dog.getRefID()) {
					isFound = true;
					break;
				}
			}
			if(isFound) {
			AddParrotManager.getList().remove(refID - 3001);
			}else {
				System.out.println("Animal ID not found!");
			}
		}
	}
}
