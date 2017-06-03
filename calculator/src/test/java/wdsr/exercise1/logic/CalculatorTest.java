package wdsr.exercise1.logic;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	//MAX
	
	@Test
	public void testMax_shouldReturnOnlyValue(){
		//given
		int[] values = {5};
		//when
		int max = calculator.max(values);
		//then
		assertThat(values[0],is(max));
	}
	
	@Test
	public void testMax_shouldReturnGreatestValue(){
		//given
		int[] values = {2,-3,5};
		//when
		int greatestValue = calculator.max(values);
		//then
		assertThat(greatestValue,is(values[2]));				
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;		
		// when
		int result = calculator.max(values);		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};		
		// when
		calculator.max(values);		
		// then
		// empty
	}
	
	
}
