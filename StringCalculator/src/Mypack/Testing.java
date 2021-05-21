package Mypack;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testing {
	Calculator calculator=new Calculator();
	
	@Test
	public void returnZeroOnEmptyString()
	{
		assertEquals(0,calculator.Add("0"));
	}
	@Test
	public void returnNumberforSingleInput()
	{
		assertEquals(2,calculator.Add("2"));
	}
	@Test
	public void returnSumForTwoInputs()
	{
		assertEquals(7,calculator.Add("2,5"));
	}
	@Test
	public void HandlingUnknownNumberOfInputs()
	{
		assertEquals(14,calculator.Add("2,5,7"));
	}

}
