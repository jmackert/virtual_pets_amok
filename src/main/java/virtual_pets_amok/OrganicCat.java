package virtual_pets_amok;

public class OrganicCat extends OrganicAnimal {

	private int litterBoxDirtinessLevel;

	public OrganicCat(String name, int health, int happiness, int tick, int hunger, int thirst, int pottyNeeds, int litterBox) {
		super(name, health, happiness, tick, hunger, thirst, pottyNeeds);
		this.litterBoxDirtinessLevel = litterBox;
	}

	public int getLitterBoxDirtinessLevel() {
		return litterBoxDirtinessLevel;
	}
	
	public void increaseLitterBoxDirtinessLevel() {
		litterBoxDirtinessLevel++;
	}
	
	public void cleadLitterBox() {
		litterBoxDirtinessLevel = 0;
	}
	
	@Override
	public int getHealthLevel() {
		if(litterBoxDirtinessLevel > 5 || hungerLevel > 5 || thirstLevel > 5) {
			decreaseHealthLevel();
			decreaseHappinessLevel();
		}
		if(happinessLevel < 5) {
			decreaseHealthLevel();
		}
		return healthLevel;
	}
	
	@Override
	public int getPottyNeeds() {
		if(pottyNeeds >= 10) {
			decreasePottyNeeds();
			increaseLitterBoxDirtinessLevel();
		}
		return pottyNeeds;
	}

}
