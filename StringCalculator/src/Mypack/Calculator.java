package Mypack;

public class Calculator {	
	int Add(String input)
	{
		return getSum(input);
	}

	public int getSum(String input) {
		int sum=0;
		String[] inputs=input.split(",|\n");
		for(String i:inputs)
		{
			sum=sum+Integer.parseInt(i);
		}
		return sum;
	}

}
