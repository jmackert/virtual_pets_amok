package virtual_pets_amok;

public class OrganicDog extends OrganicAnimal implements DogActivities {

	private int cageDirtinessLevel;

	public OrganicDog(String name, int health, int happiness, int hunger, int thirst, int pottyNeeds, int cageDirtiness, int tick) {
		super(name, health, happiness, tick, hunger, thirst, pottyNeeds);
		this.cageDirtinessLevel = cageDirtiness;
	}

	public int getCageDirtinessLevel() {
		return cageDirtinessLevel;
	}

	public void increaseeCageDirtinessLevel() {
		cageDirtinessLevel++;
	}

	public void cleanCage() {
		cageDirtinessLevel = 0;
	}

	@Override
	public void walkDogs() {
		increaseHappinessLevel();
		increaseHungerLevel();
		increaseThirstLevel();
		increaseHealthLevel();
		decreasePottyNeeds();
		
	}

}
