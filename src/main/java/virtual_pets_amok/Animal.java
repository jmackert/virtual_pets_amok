package virtual_pets_amok;

public abstract class Animal {

	protected String name;
	protected int healthLevel;
	protected int happinessLevel;
	protected int tickLevel;


	public String getPetsName() {
		return name;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	public int getTickLevel() {
		return tickLevel;
	}

	public void increaseTickLevel() {
		tickLevel++;
	}

	public void increaseHappinessLevel() {
		happinessLevel++;
	}

	public void increaseHealthLevel() {
		healthLevel++;
	}

	public void decreaseHealthLevel() {
		healthLevel--;
	}

	public void decreaseHappinessLevel() {
		happinessLevel--;
	}
	

}