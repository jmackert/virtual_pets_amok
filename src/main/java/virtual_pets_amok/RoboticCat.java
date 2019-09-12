package virtual_pets_amok;

public class RoboticCat extends RoboticAnimal {

	public RoboticCat(String name, int health, int happiness, int tick, int maintenance) {
		super(name, health, happiness, tick, maintenance);
		this.happinessLevel = 10;
		this.healthLevel = 10;
	}

	@Override
	public int getHealthLevel() {
		if (maintenanceLevel > 5) {
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

}
