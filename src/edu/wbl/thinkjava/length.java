package edu.wbl.thinkjava;

import java.util.Arrays;

public class length {
	public static void main(String[] args) {
	int[] arr=new int[] {10,11,12,13};
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
		
	}
		int arr1[]=Arrays.copyOf(arr, 5);
		arr1[3]=14;
		arr1[4]=15;

		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		
	}
	
	}
	
}
