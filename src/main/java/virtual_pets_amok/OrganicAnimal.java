package virtual_pets_amok;

public abstract class OrganicAnimal extends Animal {

	protected int hungerLevel;
	protected int thirstLevel;
	protected int pottyNeeds;
	

	public OrganicAnimal(String name, int health, int happiness, int tick, int hunger, int thirst, int pottyNeeds) {
		this.name = name;
		this.healthLevel = health;
		this.happinessLevel = happiness;
		this.tickLevel = tick;
		this.hungerLevel = hunger;
		this.thirstLevel = thirst;
		this.pottyNeeds = pottyNeeds;
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

	public void increaseHungerLevel() {
		hungerLevel++;
	}

	public void increaseThirstLevel() {
		thirstLevel++;
	}

	public void increasePottyNeeds() {
		pottyNeeds++;
	}

	public void decreaseHungerLevel() {
		hungerLevel = 0;
	}

	public void decreaseThirstLevel() {
		thirstLevel = 0;
	}

	public void decreasePottyNeeds() {
		pottyNeeds = 0;
	}

}