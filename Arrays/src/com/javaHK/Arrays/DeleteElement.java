package com.javaHK.Arrays;
import java.util.Arrays;
//To remove an element at index location 2.
public class DeleteElement {
	public static void main(String[] args) {
		//Approach 1 using second array and copying.
		int[] ia1 = {3,2,5,7,6};
		System.out.println(Arrays.toString(ia1));
		
		int index = 2;
		int[] ia2 = new int[ia1.length-1];
		for (int i = 0, j=0; i < ia1.length; i++,j++) {
			if (i!=index) {
				ia2[j] = ia1[i];
			}
			else {
				j--;
			}
		}
		ia1 = ia2;
		System.out.println(Arrays.toString(ia1));
		
		//Approach 2 using only one array.
		int [] ia3 = {3,2,5,7,6};
		System.out.println(Arrays.toString(ia3));
		
		for (int i = index; i < ia3.length-1; i++) {
			ia3[i] = ia3[i+1];
		}
		ia3[ia3.length-1] = 0;
		
		for (int i = 0; i < ia3.length-1; i++) {
			System.out.print(ia3[i]+" ");
		}
		
	}

}
