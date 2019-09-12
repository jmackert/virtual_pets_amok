package virtual_pets_amok;

public abstract class RoboticAnimal extends Animal {

	protected int maintenanceLevel;

	public RoboticAnimal(String name, int health, int happiness, int tick, int maintenance) {
		this.name = name;
		this.healthLevel = health;
		this.happinessLevel = happiness;
		this.tickLevel = tick;
		this.maintenanceLevel = maintenance;
	}

	public int getMaintenanceLevel() {
		if (tickLevel % 3 == 0) {
			increaseMaintenanceLevel();
		}
		return maintenanceLevel;
	}

	public void increaseMaintenanceLevel() {
		maintenanceLevel++;
	}

	public void decraseMaintenanceLevel() {
		maintenanceLevel = 0;
		increaseHappinessLevel();
		increaseHealthLevel();
	}
}
