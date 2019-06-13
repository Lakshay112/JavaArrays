package edu.wbl.thinkjava;

import java.util.Arrays;

public class toString {
	
	public static void printArray(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++) {
		System.out.print(", " + a[i]);
		}
		System.out.println("}");
		}
	
	//toString method converts to a string
	public int[] print(){
		int[] a={5,6,7,8};
		System.out.print(Arrays.toString(a));
		
		return a;
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		//System.out.println(a);
		toString ts=new toString();
		ts.printArray(a);
		ts.print();
	}

}
