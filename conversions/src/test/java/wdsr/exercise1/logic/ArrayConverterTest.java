package wdsr.exercise1.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest {
	
	private ArrayConverter arrayConverter;

	@Before
	public void setup(){
		arrayConverter = new ArrayConverter();
	}
	
	@Test 
	public void testConvertToInts_shouldConvertFromStringArrayToIntArray(){
		
		String[] strings = {"1","2","3","4" };
		
		int[] numbers = {1,2,3,4};
		
		int[] converter = arrayConverter.convertToInts(strings);
		
		assertThat(converter,is(numbers));
	}
	
	@Test(expected=NullPointerException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForNullArgument(){
		
		String strings[] = null;
		
		arrayConverter.convertToInts(strings);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shoudlRaiseAnExceptionForNotIntArgument(){
		
		String strings[] = {"1a","2b","3c","4d"};
		
		arrayConverter.convertToInts(strings);
	}

}
