package com.training.manager;

public class EmptyNotif {
	public void notifyEmptyShelter() {
		if (AddDogManager.getList().size() == 0 && AddCatManager.getList().size() == 0
				&& AddParrotManager.getList().size() == 0) {
			System.out.println("The shelter is currently empty.");
		}
	}
}
