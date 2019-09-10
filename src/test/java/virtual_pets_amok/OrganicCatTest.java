package virtual_pets_amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat underTest = new OrganicCat("name",1,1,1,1,1,1,1);
	
	@Test
	public void shouldReturnName() {
		String check = underTest.getPetsName();
		assertEquals(check,"name");
	}
	
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
		int check = underTest.getLitterBoxDirtinessLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldReturnTickLevel() {
		int check = underTest.getTickLevel();
		assertEquals(check,1);
	}
	
	@Test
	public void shouldIncreaseTickLevel() {
		underTest.increaseTickLevel();
		int tickAfter = underTest.getTickLevel();
		assertThat(tickAfter, is(2));
	}
	
	@Test
	public void shouldIncreaseHungerLevel() {
		underTest.increaseHungerLevel();
		int hungerAfter = underTest.getHungerLevel();
		assertThat(hungerAfter, is(2));
	}

	@Test
	public void shouldDecreaseHungerLevel() {
		underTest.decreaseHungerLevel();
		int hungerAfter = underTest.getHungerLevel();
		assertThat(hungerAfter, is(0));
	}
	
	@Test
	public void shouldDecreaseHappinessLevel() {
		underTest.decreaseHappinessLevel();
		int happinessAfter = underTest.getHappinessLevel();
		assertThat(happinessAfter, is(0));
	}
}
