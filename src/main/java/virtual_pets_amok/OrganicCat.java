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

}
