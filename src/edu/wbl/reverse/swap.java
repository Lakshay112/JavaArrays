package edu.wbl.reverse;

import java.util.Arrays;

public class swap {
	

	public static void swap1(int[] A,int i,int j ){
	int temp=A[i];
	A[i]=A[j];
	A[j]=temp;
	}
	
	public  static void reverse(int[] A){
		int high=A.length-1;
		for(int low=0; low < high;low++,high--){
			swap1(A,low,high);
			
		}	
	}
	public static void main(String[] args) {
		int[] A={1,2,3,4};
		reverse(A);
		System.out.println(Arrays.toString(A));
	}

}
