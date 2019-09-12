package virtual_pets_amok;

import java.util.Scanner;

public class VirtualPetsAmokApp {
	static Scanner input = new Scanner(System.in);
	static boolean running = true;
	static Shelter myShelter = new Shelter();

	public static void displayMainMenu() {
		System.out.println("1: Add pet");
		System.out.println("2: Feed all the organic animals");
		System.out.println("3: Give water to all the organic animals");
		System.out.println("4: Clean the litter box");
		System.out.println("5: Clean the cages");
		System.out.println("6: Walk the dogs");
		System.out.println("7: Oil robotic pets");
		System.out.println("8: Sell a pet");
		System.out.println("9: Do nothing");
		System.out.println("10: QUIT");
		int interaction = input.nextInt();
		switch (interaction) {
		case 1:
			displayAddPetMenu();
			break;
		case 2:
			myShelter.feedOrganicAnimals();
			break;
		case 3:
			myShelter.waterOrganicAnimals();
			break;
		case 4:
			myShelter.cleanCatLitter();
			break;
		case 5:
			myShelter.cleanCages();
			break;
		case 6:
			myShelter.walkTheDogs();
			break;
		case 7:
			myShelter.oilRoboticPets();
			break;
		case 8:
			myShelter.removePet();
			break;
		case 9:
			myShelter.increaseTick();
			break;
		case 10:
			running = false;
		default:
			myShelter.increaseTick();
		}
	}

	public static void showShelter() {
		myShelter.showOrganicDogs();
		myShelter.showOrganicCats();
		myShelter.showRoboticDogs();
		myShelter.showRoboticCats();
	}

	public static void displayAddPetMenu() {
		System.out.println("1: Add organic dog");
		System.out.println("2: Add organic cat");
		System.out.println("3: Add robotic dog");
		System.out.println("4: Add robotic cat");
		int interaction = input.nextInt();
		switch (interaction) {
		case 1:
			myShelter.addOrganicDog();
			break;
		case 2:
			myShelter.addOrganicCat();
			break;
		case 3:
			myShelter.addRoboticDog();
			break;
		default:
			myShelter.addRoboticCat();
		}
	}

	public static void main(String[] args) {

		while (running == true) {

			displayMainMenu();
			showShelter();

		}

	}

}
