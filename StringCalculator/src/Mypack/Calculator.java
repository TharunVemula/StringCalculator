package Mypack;

public class Calculator {
	private int sum=0;
	private String delimiter=",|\n";
	
	int Add(String input) throws Exception
	{
		if(input.startsWith("//"))
		{
			input=extraxtInput(input);
		}
		return getSum(input);
	}

	private String extraxtInput(String input) {
		String[] contents=input.split("\n",2);
		findDelimiter(contents);
		return contents[1];
	}

	public void findDelimiter(String[] contents) {
		delimiter=contents[0].substring(2);
		if(delimiter.startsWith("["))
		{
			delimiter=delimiter.substring(1,delimiter.length()-1);
		}
	}

	private int getSum(String input) throws Exception {
		String[] inputs=input.split(delimiter);
		countNegativeNumbers(inputs);
		for(String i:inputs)
		{
			sum=sum+checkNumber(i);
		}
		return sum;
	}

	private int checkNumber(String i) {
		if(stringToInt(i)>1000)
			return 0;
		else
			return stringToInt(i);
	}

	private void countNegativeNumbers(String[] inputs) throws Exception {
		String message = getExceptionMessage(inputs);
		if(!message.isEmpty())
			throw new Exception("negatives not allowed"+message);
	}

	public String getExceptionMessage(String[] inputs) {
		String message="";
		for(String i:inputs)
		{
			if(stringToInt(i)<0)
				message+=","+i;
		}
		return message;
	}

	public int stringToInt(String i){
		return Integer.parseInt(i);
	}
}
