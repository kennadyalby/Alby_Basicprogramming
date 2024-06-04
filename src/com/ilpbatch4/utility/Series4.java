package com.ilpbatch4.utility;
 
import java.lang.Math;
 
public class Series4 {
 
	public static void main(String[] args) {
		int input = 2;
		sumOfSeries2(input);
 
	}
 
	private static void sumOfSeries2(int input) {
		double sum = 0;
		int temp;
		int j=1;
		int k=2;
		
	
		System.out.print("The Sum of the series : ");
		for (int i = 1; i <= input; i++) {
			System.out.print(i+"^"+3+"+");
			
			sum = sum + Math.pow(j, 3);
			
			temp=j;
			j=k;
			k=temp+k;
			
		}
		
		System.out.print(" is " + sum);
 
	}
 
}
