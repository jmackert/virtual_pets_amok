package virtual_pets_amok;

public class RoboticDog extends RoboticAnimal implements DogActivities {

	public RoboticDog(String name, int health, int happiness, int tick, int maintenance) {
		super(name, health, happiness, tick, maintenance);
	}

	@Override
	public void walkDogs() {
		increaseHappinessLevel();
		increaseHealthLevel();
		increaseMaintenanceLevel();
	}

}
