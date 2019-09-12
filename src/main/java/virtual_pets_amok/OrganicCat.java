package virtual_pets_amok;

public class OrganicCat extends OrganicAnimal {


	public OrganicCat(String name, int health, int happiness, int tick, int hunger, int thirst, int pottyNeeds) {
		super(name, health, happiness, tick, hunger, thirst, pottyNeeds);
		this.happinessLevel = 10;
		this.healthLevel = 10;
	}

	@Override
	public int getHealthLevel() {
		if ( hungerLevel > 5 || thirstLevel > 5) {
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
	public int getPottyNeeds() {
		if (pottyNeeds >= 5) {
			decreasePottyNeeds();
		}
		return pottyNeeds;
	}

}
