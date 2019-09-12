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
		newPet.increaseTickLevel();
	}

	public void addOrganicCat() {
		System.out.println("Enter the organic cat's name: ");
		String name = input.nextLine();
		OrganicCat newPet = new OrganicCat(name, 0, 0, 0, 0, 0, 0, 0);
		organicCatShelter.add(newPet);
		newPet.increaseTickLevel();
	}

	public void addRoboticDog() {
		System.out.println("Enter the robotic dog's name: ");
		String name = input.nextLine();
		RoboticDog newPet = new RoboticDog(name, 0, 0, 0, 0);
		roboticDogShelter.add(newPet);
		newPet.increaseTickLevel();
	}

	public void addRoboticCat() {
		System.out.println("Enter the robotic cat's name: ");
		String name = input.nextLine();
		RoboticCat newPet = new RoboticCat(name, 0, 0, 0, 0);
		roboticCatShelter.add(newPet);
		newPet.increaseTickLevel();
	}

	public void showOrganicDogs() {
		System.out.println("Organic Dogs:");
		for (OrganicDog pets : organicDogShelter) {
			System.out.println("Name: " + pets.getPetsName() + "   Health: " + pets.getHealthLevel() + "   Happiness: "
					+ pets.getHappinessLevel() + "   Hunger: " + pets.getHungerLevel() + "   Thirst: "
					+ pets.getThirstLevel() + "   Potty Needs: " + pets.getPottyNeeds() + "   Cage Filth: "
					+ pets.getCageDirtinessLevel());
		}
	}

	public void showOrganicCats() {
		System.out.println("Organic Cats:");
		for (OrganicCat pets : organicCatShelter) {
			System.out.println("Name: " + pets.getPetsName() + "   Health: " + pets.getHealthLevel() + "   Happiness: "
					+ pets.getHappinessLevel() + "   Hunger: " + pets.getHungerLevel() + "   Thirst: "
					+ pets.getThirstLevel() + "   Potty Needs: " + pets.getPottyNeeds() + "   Litter Box Filth: "
					+ pets.getLitterBoxDirtinessLevel());
		}
	}

	public void showRoboticDogs() {
		System.out.println("Robotic Dogs:");
		for (RoboticDog pets : roboticDogShelter) {
			System.out.println("Name: " + pets.getPetsName() + "   Health: " + pets.getHealthLevel() + "   Happiness: "
					+ pets.getHappinessLevel() + "   Maintenance Level: " + pets.getMaintenanceLevel());
		}
	}

	public void showRoboticCats() {
		System.out.println("Robotic Cats:");
		for (RoboticCat pets : roboticCatShelter) {
			System.out.println("Name: " + pets.getPetsName() + "   Health: " + pets.getHealthLevel() + "   Happiness: "
					+ pets.getHappinessLevel() + "   Maintenance Level: " + pets.getMaintenanceLevel());

		}
	}

	public void feedOrganicAnimals() {
		for (OrganicDog pets : organicDogShelter) {
			pets.decreaseHungerLevel();
		}
		for (OrganicCat pets : organicCatShelter) {
			pets.decreaseHungerLevel();
		}
		System.out.println("You fed all the organic animals");
	}

	public void waterOrganicAnimals() {
		for (OrganicDog pets : organicDogShelter) {
			pets.decreaseThirstLevel();
		}
		for (OrganicCat pets : organicCatShelter) {
			pets.decreaseThirstLevel();
		}
		System.out.println("You gave water to all the organic animals");
	}

	public void cleanCatLitter() {
		for (OrganicCat pets : organicCatShelter) {
			pets.cleadLitterBox();
		}
		System.out.println("You cleaned the Litter box");
	}

	public void cleanCages() {
		for (OrganicDog pets : organicDogShelter) {
			pets.cleanCage();
		}
		System.out.println("You cleaned the Cages");
	}

	public void walkTheDogs() {
		for (OrganicDog pets : organicDogShelter) {
			pets.walkDogs();
		}
		for (RoboticDog pets : roboticDogShelter) {
			pets.walkDogs();
		}
		System.out.println("You walked all the dogs");
	}

	public void oilRoboticPets() {
		for (RoboticDog pets : roboticDogShelter) {
			pets.decraseMaintenanceLevel();
		}
		for (RoboticCat pets : roboticCatShelter) {
			pets.decraseMaintenanceLevel();
		}
		System.out.println("You oiled all the robotic animals");
	}

	public void increaseTick() {
		for (RoboticDog pets : roboticDogShelter) {
			pets.increaseTickLevel();
		}
		for (RoboticCat pets : roboticCatShelter) {
			pets.increaseTickLevel();
		}

		for (OrganicDog pets : organicDogShelter) {
			pets.increaseTickLevel();
		}
		for (OrganicCat pets : organicCatShelter) {
			pets.increaseTickLevel();
		}
		System.out.println("You did nothing");
	}
}
