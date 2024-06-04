package com.ilpbatch4.utility;

public class SumOfSeries {
	public static void main(String args[])
	{
		
		
		int in=4;
		sum(in);
		
		
	}

	private static void sum(int n) {
		int num=1;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum-num;
				
			}
			else {
				sum= sum+num;
			}
			num=num+2;
		}
		System.out.print("Answer is"+sum);
	
		
		
		
	}
	

}
