package virtual_pets_amok;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shelter {
	
	List<OrganicDog> organicDogShelter = new ArrayList();
	List<OrganicCat> organicCatShelter = new ArrayList();
	List<RoboticDog> roboticDogShelter = new ArrayList();
	List<RoboticCat> roboticCatShelter = new ArrayList();

	Scanner input = new Scanner(System.in);

	
	public void addOrganicDog() {
		System.out.println("Enter the organic dog's name: ");
		String name = input.nextLine();
		OrganicDog newPet = new OrganicDog(name, 0, 0, 0, 0, 0, 0, 0);
		organicDogShelter.add(newPet);
	}
	
	public void addOrganicCat() {
		System.out.println("Enter the organic cat's name: ");
		String name = input.nextLine();
		OrganicCat newPet = new OrganicCat(name, 0, 0, 0, 0, 0, 0, 0);
		organicCatShelter.add(newPet);
	}
	
	public void addRoboticDog() {
		System.out.println("Enter the robotic dog's name: ");
		String name = input.nextLine();
		RoboticDog newPet = new RoboticDog(name, 0, 0, 0, 0);
		roboticDogShelter.add(newPet);
	}
	
	public void addRoboticCat() {
		System.out.println("Enter the robotic cat's name: ");
		String name = input.nextLine();
		RoboticCat newPet = new RoboticCat(name, 0, 0, 0, 0);
		roboticCatShelter.add(newPet);
	}
	
	public void showOrganicDogs() {
		System.out.println("Organic Dogs:");
		for(OrganicDog pets : organicDogShelter) {
			System.out.println("Name: " + pets.getPetsName() + " Hunger: " + pets.getHungerLevel() + " cage: " + pets.getCageDirtinessLevel());
		}
	}
	
	public void showOrganicCats() {
		System.out.println("Organic Cats:");
		for(OrganicCat pets : organicCatShelter) {
			System.out.println("Name: " + pets.getPetsName() + " Hunger: " + pets.getHungerLevel() + " litter: " + pets.getLitterBoxDirtinessLevel());
		}
	}
	
	public void showRoboticDogs() {
		System.out.println("Robotic Dogs:");
		for(RoboticDog pets : roboticDogShelter) {
			System.out.println("Name: " + pets.getPetsName() + " oil: " + pets.getMaintenanceLevel());
		}
	}
	
	public void showRoboticCats() {
		System.out.println("Robotic Cats:");
		for(RoboticCat pets : roboticCatShelter) {
			System.out.println("Name: " + pets.getPetsName() + " oil: " + pets.getMaintenanceLevel());
		}
	}
	
	public void showShelter() {
		showOrganicDogs();
		showOrganicCats();
		showRoboticDogs();
		showRoboticCats();
	}

}
