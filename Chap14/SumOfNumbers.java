// SumOfNumbers.java
// Bryan Ramirez 
// May 3, 2019



public class SumOfNumbers 
{

	public static void main(String[] args) 
	{
		int n = 50;
		System.out.println("The sum of the integers 1 through " + n + " is " + sum(n));
	}
	
	public static int sum(int number)
	{
		if (number == 1)
		{
			return 1;
		}
		else 
		{
			return number + sum(number-1);
		}
		
	}

}
