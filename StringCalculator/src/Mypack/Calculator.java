package Mypack;

public class Calculator {
	int sum=0;
	
	int Add(String input)
	{
		return getSum(input);
	}

	public int getSum(String input) {
		String[] inputs=input.split(",");
		for(String i:inputs)
		{
			sum=sum+Integer.parseInt(i);
		}
		return sum;
	}

}
