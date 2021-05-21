package Mypack;

public class Calculator {
	private int sum=0;
	private String delimiter=",|\n";
	
	int Add(String input)
	{
		if(input.startsWith("//"))
		{
			input=extraxtInput(input);
		}
		return getSum(input);
	}

	private String extraxtInput(String input) {
		String[] contents=input.split("\n",2);
		delimiter=contents[0].substring(2);
		return contents[1];
	}

	private int getSum(String input) {
		String[] inputs=input.split(delimiter);
		for(String i:inputs)
		{
			sum=sum+Integer.parseInt(i);
		}
		return sum;
	}

}
