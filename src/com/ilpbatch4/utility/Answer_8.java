package com.ilpbatch4.utility;
 
public class Answer_8 {
 
	public static void main(String[] args) {
		int array[] = {1,2,1,3,2,2};
		array8(array);
 
	}
 
	private static void array8(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					System.out.println(array[i]);
				}
			}
		}
	}
}