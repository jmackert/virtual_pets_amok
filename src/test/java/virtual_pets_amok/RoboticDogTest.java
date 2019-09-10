package virtual_pets_amok;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RoboticDogTest {
	
	RoboticDog underTest = new RoboticDog("name",1,1,1,1);
	
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
	public void shouldDecreaseHappinessLevel() {
		underTest.decreaseHappinessLevel();
		int happinessAfter = underTest.getHappinessLevel();
		assertThat(happinessAfter, is(0));
	}
	
	@Test
	public void shouldIncreaseMaintenanceLevel() {
		underTest.increaseMaintenanceLevel();
		int maintenanceAfter = underTest.getMaintenanceLevel();
		assertThat(maintenanceAfter, is(2));
	}

}
