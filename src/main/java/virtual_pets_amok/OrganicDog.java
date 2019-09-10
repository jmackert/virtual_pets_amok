package virtual_pets_amok;

public class OrganicDog {

	private int healthLevel;
	private int happinessLevel;
	private int hungerLevel;
	private int thirstLevel;
	private int pottyNeeds;
	private int cageCleanlinessLevel;

	public OrganicDog(int health, int happiness, int hunger, int thirst, int pottyNeeds, int cageCleanliness) {
		this.healthLevel = health;
		this.happinessLevel = happiness;
		this.hungerLevel = hunger;
		this.thirstLevel = thirst;
		this.pottyNeeds = pottyNeeds;
		this.cageCleanlinessLevel = cageCleanliness;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getPottyNeeds() {
		return pottyNeeds;
	}

	public int getCageCleanlinessLevel() {
		return cageCleanlinessLevel;
	}

}
