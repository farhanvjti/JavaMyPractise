package com.javaHK.Arrays;

import java.util.Arrays;
//To add an element at index location 2.
public class InsertElement {
	public static void main(String[] args) {
		int[] ia1 = {3,2,7,6};
		System.out.println(Arrays.toString(ia1));
		
		int index = 2; int element = 5;
		int[] ia2 = new int[ia1.length+1];
		
		for (int i=0,j=0; j < ia2.length; i++,j++) {
			if (j!=index) {
				ia2[j]=ia1[i];
			}
			else {
				ia2[j]=element;
				i--;
			}
		}
		ia1 = ia2;
		System.out.println(Arrays.toString(ia1));
	}

}
