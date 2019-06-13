package edu.wbl.arrays;

import java.util.Arrays;
import java.util.Collections;

public class sorting {
	
	
	public void asen(int[] a){
		Arrays.sort(a);
		System.out.println("Sorted array is"+Arrays.toString(a));
		
	}
	
/*	public void desn(int[] a){
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
	}
*/	

	public void swap(int[] b){
		// Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {7, 6, 45, 21} and 
        // keep other elements as it is. 
		Arrays.sort(b , 1 , 5);
		System.out.println("Swaping positions"+Arrays.toString(b));
		
	}
	
	public static void main(String[] args) {
		int[] a={10,2,3,4,5,11,23,6};
		int[] b={8,4,3,2,1,5,6,7,};
		sorting s=new sorting();
		sorting s1=new sorting();
		s.asen(a);
		s1.swap(b);
		
		
		
		
	}

}
