package Mypack;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class Testing {
	Calculator calculator=new Calculator();
	
	@Test
	public void returnZeroOnEmptyString() throws Exception
	{
		assertEquals(0,calculator.Add("0"));
	}
	@Test
	public void returnNumberforSingleInput() throws Exception
	{
		assertEquals(2,calculator.Add("2"));
	}
	@Test
	public void returnSumForTwoInputs() throws Exception
	{
		assertEquals(7,calculator.Add("2\n5"));
	}
	@Test
	public void HandlingUnknownNumberOfInputs() throws Exception
	{
		assertEquals(14,calculator.Add("2,5,7"));
	}
	@Test
	public void CommaAndNewLineAsDelimiters() throws Exception
	{
		assertEquals(20,calculator.Add("2\n5,7\n6"));
	}
	@Test
	public void UserSpecifiedDelimiter() throws Exception
	{
		assertEquals(10,calculator.Add("//;\n2;3;5"));
	}
	
	@Test
	public void negativeNumberThrowsException() throws Exception
	{
		 Throwable exception = assertThrows(
		            Exception.class, () -> {
		            	calculator.Add("-1,-3");
		            }
		    );
		 assertEquals("negatives not allowed,-1,-3", exception.getMessage());   
	}
	@Test
	public void ignoreNumbersGreaterThan1000() throws Exception
	{
		assertEquals(5,calculator.Add("1001,5"));
	}
	@Test
	public void delimiterWithAnyLength() throws Exception
	{
		assertEquals(6,calculator.Add("//[;;;]\n1;;;2;;;3"));
	}
}
