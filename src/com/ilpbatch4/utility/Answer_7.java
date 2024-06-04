package com.ilpbatch4.utility;
 
public class Answer_7{
 
	public static void main(String[] args) {
		int array[] = {1,2,6,7,4};
		find(array);
 
	}
 
	private static void find(int[] array) {
		int limit=10;
		int flag;
		for(int i=1; i<=limit; i++) {
			flag = 0;
			for(int j=0; j<array.length; j++) {
				if(i == array[j]) {
					flag=1;
				}
			}
			if(flag == 0) {
				System.out.println(i);
			}
		}
		
	}
 
}
