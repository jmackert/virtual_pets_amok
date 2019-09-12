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
		if (tickLevel % 3 == 0) {
			increaseHungerLevel();
		}
		return hungerLevel;
	}

	public int getThirstLevel() {
		if (tickLevel % 3 == 0) {
			increaseThirstLevel();
		}
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
		increaseThirstLevel();
		increasePottyNeeds();
		increaseHappinessLevel();
		increaseHealthLevel();
	}

	public void decreaseThirstLevel() {
		thirstLevel = 0;
		increaseHungerLevel();
		increasePottyNeeds();
		increaseHappinessLevel();
		increaseHealthLevel();
	}

	public void decreasePottyNeeds() {
		pottyNeeds = 0;
	}

}