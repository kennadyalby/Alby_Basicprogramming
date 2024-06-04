package com.ilpbatch4.utility;

public class DecendingOrder {

	public static void main(String[] args) {
		int a=3,b=2,c=5;
		desc(a,b,c);

	}

	private static void desc(int a, int b, int c) {
//		int temp;
		if(a<b&&a<c) 
		{
			if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		if(b<a&&b<c) 
		{
			if(a>c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		}
		else if(b<a&&b<c) 
		{
			if(a>c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		}
		else
			
		{
			if(a>c)
			{
				System.out.println(a);
				System.out.println(b);
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}
		}
	
		
	}

}
