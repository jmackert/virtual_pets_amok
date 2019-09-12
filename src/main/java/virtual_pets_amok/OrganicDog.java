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

	public void increaseCageDirtinessLevel() {
		cageDirtinessLevel++;
	}

	public void cleanCage() {
		cageDirtinessLevel = 0;
		increaseHappinessLevel();
	}

	@Override
	public int getHealthLevel() {
		if(cageDirtinessLevel > 5 || hungerLevel > 5 || thirstLevel > 5) {
			decreaseHealthLevel();
			decreaseHappinessLevel();
		}
		if(happinessLevel < 5) {
			decreaseHealthLevel();
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
		if(pottyNeeds >= 10) {
			decreasePottyNeeds();
			increaseCageDirtinessLevel();
		}
		return pottyNeeds;
	}

}
