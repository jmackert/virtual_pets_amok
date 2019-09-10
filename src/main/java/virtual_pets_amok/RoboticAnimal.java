package virtual_pets_amok;

public abstract class RoboticAnimal extends Animal {
	
	private int maintenanceLevel;
	
	public RoboticAnimal(String name, int health, int happiness, int tick, int oil) {
		this.maintenanceLevel = oil;
	}
	
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}
	
	public void increaseMaintenanceLevel() {
		maintenanceLevel++;
	}
	
	public void decraseMaintenanceLevel() {
		maintenanceLevel = 0;
	}
}
