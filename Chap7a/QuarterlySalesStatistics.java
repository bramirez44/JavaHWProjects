// QuarterlySalesStatistics.java
// Bryan Ramirez
// April 7, 2019

import java.text.NumberFormat;
public class QuarterlySalesStatistics 
{
	public static void main(String[] args) 
	{
		final int DIVISIONS = 7;
		final int QUARTERS = 4;
		double[][] quarterlySales = new double[DIVISIONS][QUARTERS];
		int sum1 = 0;
		int sum2= 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int div = 0; div < DIVISIONS; ++div)
		{
			int quart = 0;
			switch (div)
			{
				case 0:
					quarterlySales[div][quart] = 1000;
					quarterlySales[div][quart+1] = 2000;
					quarterlySales[div][quart+2] = 3000;
					quarterlySales[div][quart+3] = 4000;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 1:
					quarterlySales[div][quart] = 10000;
					quarterlySales[div][quart+1] = 20000;
					quarterlySales[div][quart+2] = 30000;
					quarterlySales[div][quart+3] = 40000;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 2:
					quarterlySales[div][quart] = 100000;
					quarterlySales[div][quart+1] = 200000;
					quarterlySales[div][quart+2] = 300000;
					quarterlySales[div][quart+3] = 400000;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 3:
					quarterlySales[div][quart] = 10000;
					quarterlySales[div][quart+1] = 20000;
					quarterlySales[div][quart+2] = 30000;
					quarterlySales[div][quart+3] = 40000;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 4:
					quarterlySales[div][quart] = 1000;
					quarterlySales[div][quart+1] = 2000;
					quarterlySales[div][quart+2] = 3000;
					quarterlySales[div][quart+3] = 4000;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 5:
					quarterlySales[div][quart] = 100;
					quarterlySales[div][quart+1] = 200;
					quarterlySales[div][quart+2] = 300;
					quarterlySales[div][quart+3] = 400;
					sum1 += quarterlySales[div][quart];
					sum2 += quarterlySales[div][quart+1];
					sum3 += quarterlySales[div][quart+2];
					sum4 += quarterlySales[div][quart+3];
					break;
				case 6:
					quarterlySales[div][quart] = sum1/6;
					quarterlySales[div][quart+1] = sum2/6;
					quarterlySales[div][quart+2] = sum3/6;
					quarterlySales[div][quart+3] = sum4/6;
					break;
			}	
			

		}
		
		dispQuarterlySales(quarterlySales);
	}


	
	public static void dispQuarterlySales(double salesArray[][])
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("SALES AMOUNTS BY DVISION");
		System.out.println("========================");
		for (int row = 0; row < salesArray.length; row++)
		{
			if (row < salesArray.length - 1)
			{
				System.out.println("\nDIVISION " + (row + 1));
			}
			else
			{
				System.out.println("\nAVERAGE SALES PER QUARTER");
				System.out.println("=========================\n");
			}
			for(int col = 0; col < salesArray[row].length; col++)
			{
				System.out.println("Quarter " + (col + 1) + ": " + fmt.format(salesArray[row][col]));
			}
		}
		
		

	}

}




