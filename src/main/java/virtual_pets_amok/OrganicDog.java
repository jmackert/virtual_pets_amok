package virtual_pets_amok;

public class OrganicDog {

	private int healthLevel;
	private int happinessLevel;
	private int hungerLevel;
	private int thirstLevel;
	private int pottyNeeds;
	private int cageDirtinessLevel;
	private int tickLevel;

	public OrganicDog(int health, int happiness, int hunger, int thirst, int pottyNeeds, int cageDirtiness, int tick) {
		this.healthLevel = health;
		this.happinessLevel = happiness;
		this.hungerLevel = hunger;
		this.thirstLevel = thirst;
		this.pottyNeeds = pottyNeeds;
		this.cageDirtinessLevel = cageDirtiness;
		this.tickLevel = tick;
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

	public int getCageDirtinessLevel() {
		return cageDirtinessLevel;
	}

	public int getTickLevel() {
		return tickLevel;
	}

	public void increaseTickLevel() {
		tickLevel++;
	}

	public void increaseHungerLevel() {
		hungerLevel++;
	}
	
	public void increaseThirstLevel() {
		thirstLevel++;
	}
	
	public void increasePottyNeeds() {
		pottyNeeds++;
	}
	
	public void increaseeCageDirtinessLevel() {
		cageDirtinessLevel++;
	}
	
	public void increaseHappinessLevel() {
		happinessLevel++;
	}
	
	public void increaseHealthLevel() {
		healthLevel++;
	}

}
