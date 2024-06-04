package com.ilpbatch4.utility;
 
public class Answer_12 {
 
	public static void main(String[] args) {
		int input=10;
		array12(input);
 
	}
 
	private static void array12(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(i==1 || i==n || i==j)
				{
				    if(j%2==0)
					System.out.print("#");
					else
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
 
}