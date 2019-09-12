package virtual_pets_amok;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		
		boolean running = true;
		Shelter myShelter = new Shelter();
		
		while (running == true) {
			myShelter.addOrganicDog();
			myShelter.addOrganicCat();
			myShelter.addRoboticDog();
			myShelter.addRoboticCat();
			myShelter.showShelter();

		}

	}

}
