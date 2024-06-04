package com.ilpbatch4.utility;
import java.lang.Math;
 
public class series5 {
 
	public static void main(String[] args) {
		int input=4;
		sumOfSeries3(input);
 
	}
	private static void sumOfSeries3(int input) {
		double sum=0;
		int num=1;
		
		for(int i=1;i<=input;i++) {
			if(i%2==0)
				sum=sum- Math.pow(num, i);				
			if(i%2==1)
				sum=sum+ Math.pow(num, i);
			num=num+2;
		}
		
		System.out.print("The Sum of the series 1^1-3^2+5^3-7^4.... is "+sum);
		
	}
 
}
