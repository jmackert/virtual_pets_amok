package virtual_pets_amok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogTest {
	
	OrganicDog underTest = new OrganicDog(1,1,1,1,1,1);
	
	@Test
	public void shouldReturnHealthLevel() {
		int check = underTest.getHealthLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnHappinessLevel() {
		int check = underTest.getHappinessLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnHungerLevel() {
		int check = underTest.getHungerLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnThirstLevel() {
		int check = underTest.getThirstLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnPottyNeeds() {
		int check = underTest.getPottyNeeds();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnCageCleanlinessLevel() {
		int check = underTest.getCageCleanlinessLevel();
		assertEquals(check,1);
	}

}
