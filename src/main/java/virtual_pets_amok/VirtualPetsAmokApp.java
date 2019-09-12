package virtual_pets_amok;

import java.util.Scanner;

public class VirtualPetsAmokApp {
	static Scanner input = new Scanner(System.in);
	static boolean running = true;
	static Shelter myShelter = new Shelter();

	public void interactionMenu() {
		System.out.println("1: Feed all the organic animals");
		System.out.println("2: Give water to all the organic animals");
		System.out.println("3: Clean the litter box");
		System.out.println("4: Walk the dogs");
	}

	public static void main(String[] args) {

		while (running == true) {
			System.out.println("1 for add organic dog .... 2 for add organic cat: ");
			int add = input.nextInt();
			if (add == 1) {
				myShelter.addOrganicDog();
			} else {
				myShelter.addOrganicCat();
			}
			myShelter.showShelter();

		}

	}

}
