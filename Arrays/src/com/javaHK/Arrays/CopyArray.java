package com.javaHK.Arrays;
import java.util.Arrays;
//Copy one Array to another Array
public class CopyArray {
    public static void main(String[] args) {
	int[] ia1 = {2,4,6,8};
	int[] ia2 = new int[ia1.length];
	
	System.out.println(Arrays.toString(ia1));
	
	for (int i = 0; i < ia1.length; i++) {
		ia2[i] = ia1[i];
	}
	System.out.println(Arrays.toString(ia2));
    }
}
