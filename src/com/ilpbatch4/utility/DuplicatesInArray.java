package com.ilpbatch4.utility;

public class DuplicatesInArray {
	public static void main(String args[]) 
	{
		int arr[]= {1,2,3,3,5,6,6,6};
		checker(arr);
		
	}

	private static void checker(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+"is duplicate");
					
				}
			}
			
		}
		
	}

}
