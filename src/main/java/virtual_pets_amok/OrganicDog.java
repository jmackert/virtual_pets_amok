package virtual_pets_amok;

public class OrganicDog extends OrganicAnimal implements DogActivities {

	private int cageDirtinessLevel;

	public OrganicDog(String name, int health, int happiness, int hunger, int thirst, int pottyNeeds, int cageDirtiness,
			int tick) {
		super(name, health, happiness, tick, hunger, thirst, pottyNeeds);
		this.cageDirtinessLevel = cageDirtiness;
		this.happinessLevel = 10;
		this.healthLevel = 10;
	}

	public int getCageDirtinessLevel() {
		return cageDirtinessLevel;
	}

	public void increaseCageDirtinessLevel() {
		cageDirtinessLevel++;
	}

	public void cleanCage() {
		cageDirtinessLevel = 0;
		increaseHappinessLevel();
	}

	@Override
	public int getHealthLevel() {
		if (cageDirtinessLevel > 2 || hungerLevel > 5 || thirstLevel > 5) {
			decreaseHealthLevel();
			decreaseHappinessLevel();
		}
		if (happinessLevel < 5) {
			decreaseHealthLevel();
		}
		if (happinessLevel > 10) {
			increaseHealthLevel();
		}
		return healthLevel;
	}

	@Override
	public void walkDogs() {
		increaseHappinessLevel();
		increaseHungerLevel();
		increaseThirstLevel();
		increaseHealthLevel();
		decreasePottyNeeds();
	}

	@Override
	public int getPottyNeeds() {
		if (pottyNeeds >= 5) {
			decreasePottyNeeds();
			increaseCageDirtinessLevel();
		}
		return pottyNeeds;
	}

}
